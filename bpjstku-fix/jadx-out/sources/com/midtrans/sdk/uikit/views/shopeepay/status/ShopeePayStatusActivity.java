package com.midtrans.sdk.uikit.views.shopeepay.status;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.bpjstku.R;
import com.google.android.libraries.places.internal.zzpu;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.abstracts.BasePaymentActivity;
import com.midtrans.sdk.uikit.widgets.BoldTextView;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import com.midtrans.sdk.uikit.widgets.SemiBoldTextView;
import defpackage.CameraUseCaseAdapter;
import defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14;
import defpackage.ViewPortBuilder;
import defpackage.calculateInvertedTextureTransform;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.setInternalConnectionCallback;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
public class ShopeePayStatusActivity extends BasePaymentActivity {
    private static final String g = "ShopeePayStatusActivity";
    private BoldTextView INotificationSideChannel;
    private SemiBoldTextView INotificationSideChannelDefault;
    private FancyButton RemoteActionCompatParcelizer;
    private DefaultTextView cancel;
    private BoldTextView cancelAll;
    private FancyButton d;
    private ImageView onTransact;
    private static final byte[] $$m = {56, 94, 119, -19};
    private static final int $$n = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {48, -110, 22, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$k = 28;
    private static int read = 0;
    private static int connect = 1;
    private static char[] INotificationSideChannelStubProxy = {47244, 47295, 47241, 47291, 47294, 47236, 47231, 47290, 47258, 47284, 47289, 47240, 47232, 47210, 47233, 47242, 47234, 47293, 47259, 47235, 47287, 47238, 47205, 47237};
    private static int INotificationSideChannelStub = 2047719469;
    private static boolean getInterfaceDescriptor = true;
    private static boolean IconCompatParcelizer = true;
    private final int asInterface = 15;
    private boolean notify = true;

    /* JADX INFO: renamed from: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements DefaultSurfaceProcessorExternalSyntheticLambda14<ImageView> {
        public AnonymousClass1() {
        }

        @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
        public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc, ImageView imageView) {
            if (exc == null) {
                ((FrameLayout) ShopeePayStatusActivity.this.findViewById(R.id.shopeepay_qr_code_frame)).setBackgroundColor(0);
                ShopeePayStatusActivity.asInterface(ShopeePayStatusActivity.this).setVisibility(8);
                ShopeePayStatusActivity.b(ShopeePayStatusActivity.this, true);
                ShopeePayStatusActivity.g(ShopeePayStatusActivity.this);
                return;
            }
            ((FrameLayout) ShopeePayStatusActivity.this.findViewById(R.id.shopeepay_qr_code_frame)).setBackgroundColor(ShopeePayStatusActivity.this.getResources().getColor(R.color.light_gray));
            ShopeePayStatusActivity.asInterface(ShopeePayStatusActivity.this).setVisibility(0);
            Logger.e(ShopeePayStatusActivity.a(), exc.getMessage());
            ShopeePayStatusActivity.b(ShopeePayStatusActivity.this, false);
            ShopeePayStatusActivity.a(ShopeePayStatusActivity.this);
            ShopeePayStatusActivity shopeePayStatusActivity = ShopeePayStatusActivity.this;
            Toast.makeText(shopeePayStatusActivity, shopeePayStatusActivity.getString(R.string.error_qr_code), 0).show();
        }
    }

    public static /* synthetic */ DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault1(ShopeePayStatusActivity shopeePayStatusActivity) {
        int i = 2 % 2;
        int i2 = connect + 101;
        int i3 = i2 % 128;
        read = i3;
        int i4 = i2 % 2;
        DefaultTextView defaultTextView = shopeePayStatusActivity.cancel;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 37;
        connect = i5 % 128;
        int i6 = i5 % 2;
        return defaultTextView;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ShopeePayStatusActivity shopeePayStatusActivity = (ShopeePayStatusActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        connect = i3 % 128;
        int i4 = i3 % 2;
        shopeePayStatusActivity.notify = zBooleanValue;
        int i5 = i2 + 3;
        connect = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ShopeePayStatusActivity shopeePayStatusActivity, String str, ImageView imageView) {
        int i = 2 % 2;
        calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView).TuitionPaymentFragmentbindingInflater1(str).TuitionPaymentFragmentspecialinlinedviewModeldefault1(shopeePayStatusActivity.new AnonymousClass1());
        int i2 = connect + 83;
        read = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(ShopeePayStatusActivity shopeePayStatusActivity) {
        int i = 2 % 2;
        int i2 = connect;
        int i3 = i2 + 91;
        read = i3 % 128;
        int i4 = i3 % 2;
        boolean z = shopeePayStatusActivity.notify;
        int i5 = i2 + 19;
        read = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ShopeePayStatusActivity shopeePayStatusActivity = (ShopeePayStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = read + 63;
        connect = i2 % 128;
        int i3 = i2 % 2;
        shopeePayStatusActivity.setPrimaryBackgroundColor(shopeePayStatusActivity.d);
        int i4 = connect + 61;
        read = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ShopeePayStatusActivity shopeePayStatusActivity) {
        int i = 2 % 2;
        int i2 = read + 21;
        connect = i2 % 128;
        int i3 = i2 % 2;
        shopeePayStatusActivity.asBinder();
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
    }

    public static /* synthetic */ String a() {
        int i = 2 % 2;
        int i2 = read + 29;
        int i3 = i2 % 128;
        connect = i3;
        int i4 = i2 % 2;
        String str = g;
        int i5 = i3 + 71;
        read = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void a(ShopeePayStatusActivity shopeePayStatusActivity) {
        int i = 2 % 2;
        int i2 = connect + 73;
        read = i2 % 128;
        int i3 = i2 % 2;
        shopeePayStatusActivity.b();
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = connect + 85;
        read = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ FancyButton asInterface(ShopeePayStatusActivity shopeePayStatusActivity) {
        int i = 2 % 2;
        int i2 = connect;
        int i3 = i2 + 41;
        read = i3 % 128;
        int i4 = i3 % 2;
        FancyButton fancyButton = shopeePayStatusActivity.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            int i5 = 3 / 0;
        }
        int i6 = i2 + 109;
        read = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
        return fancyButton;
    }

    public static /* synthetic */ BoldTextView b(ShopeePayStatusActivity shopeePayStatusActivity) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 113;
        connect = i3 % 128;
        int i4 = i3 % 2;
        BoldTextView boldTextView = shopeePayStatusActivity.cancelAll;
        int i5 = i2 + 97;
        connect = i5 % 128;
        int i6 = i5 % 2;
        return boldTextView;
    }

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = i5 | i3;
        int i8 = ~i;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i5);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i5) | (~i3)));
        int i13 = i5 + i3 + i6 + (1699743442 * i2) + (2071835342 * i4);
        int i14 = i13 * i13;
        int i15 = ((i5 * (-557635572)) - 1375207424) + ((-557635572) * i3) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i6) + ((-648019968) * i2) + ((-1801453568) * i4) + (1296564224 * i14);
        int i16 = ((i5 * (-355764420)) - 259725689) + (i3 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i6 * (-355763899)) + (i2 * 2119243930) + (i4 * (-943812730)) + (i14 * (-597164032));
        int i17 = i15 + (i16 * i16 * 58195968);
        if (i17 != 1) {
            return i17 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return b(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ShopeePayStatusActivity shopeePayStatusActivity = (ShopeePayStatusActivity) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 23;
        connect = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = shopeePayStatusActivity.onTransact;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = i2 + 115;
        connect = i6 % 128;
        int i7 = i6 % 2;
        return imageView;
    }

    public static /* synthetic */ void b(ShopeePayStatusActivity shopeePayStatusActivity, String str) {
        int i = 2 % 2;
        int i2 = connect + 83;
        read = i2 % 128;
        int i3 = i2 % 2;
        shopeePayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        int i4 = connect + 55;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(ShopeePayStatusActivity shopeePayStatusActivity, boolean z) {
        int i = 2 % 2;
        int i2 = connect + 35;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!z) {
            shopeePayStatusActivity.INotificationSideChannel.setVisibility(8);
            return;
        }
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        if (midtransSDK == null || TextUtils.isEmpty(midtransSDK.getMerchantName())) {
            shopeePayStatusActivity.INotificationSideChannel.setVisibility(8);
            return;
        }
        shopeePayStatusActivity.INotificationSideChannel.setText(midtransSDK.getMerchantName());
        shopeePayStatusActivity.INotificationSideChannel.setVisibility(0);
        int i3 = read + 49;
        connect = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void g(ShopeePayStatusActivity shopeePayStatusActivity) {
        int i = 2 % 2;
        int i2 = connect + 49;
        read = i2 % 128;
        int i3 = i2 % 2;
        shopeePayStatusActivity.b();
        int i4 = read + 99;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m(short s, byte b, byte b2, Object[] objArr) {
        int i = s + 4;
        int i2 = 98 - (b2 * 14);
        byte[] bArr = $$j;
        byte[] bArr2 = new byte[53 - b];
        int i3 = 52 - b;
        int i4 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i3)) - 11;
            i++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i])) - 11;
                i++;
            }
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = connect + 61;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            this.INotificationSideChannelDefault = (SemiBoldTextView) findViewById(R.id.text_page_title);
            this.d = (FancyButton) findViewById(R.id.button_primary);
        } else {
            this.INotificationSideChannelDefault = (SemiBoldTextView) findViewById(R.id.text_page_title);
            this.d = (FancyButton) findViewById(R.id.button_primary);
            throw null;
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = read + 91;
        connect = i2 % 128;
        int i3 = i2 % 2;
        if (!((BasePaymentActivity) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet));
            return;
        }
        int i4 = connect + 121;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            d();
            return;
        }
        d();
        Object obj = null;
        obj.hashCode();
        throw null;
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
                int i2 = connect + 125;
                read = i2 % 128;
                int i3 = i2 % 2;
            } catch (ParseException e2) {
                e = e2;
                Logger.e(e.getMessage());
            }
        } catch (ParseException e3) {
            e = e3;
            time = 0;
        }
        return time2 - time;
    }

    private static String TuitionPaymentFragmentbindingInflater1(String str) {
        int i = 2 % 2;
        int i2 = connect + 47;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str == null || str.split(" ").length <= 1) {
            return str;
        }
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
            String string2 = sb2.toString();
            int i3 = read + 61;
            connect = i3 % 128;
            int i4 = i3 % 2;
            return string2;
        } catch (RuntimeException | ParseException e2) {
            StringBuilder sb3 = new StringBuilder("Error while parsing date : ");
            sb3.append(e2.getMessage());
            Logger.e(sb3.toString());
            int i5 = read + 117;
            connect = i5 % 128;
            int i6 = i5 % 2;
            return "";
        }
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
                int i3 = read + 61;
                connect = i3 % 128;
                int i4 = i3 % 2;
            } catch (ParseException e2) {
                e = e2;
                Logger.e(e.getMessage());
            }
        } catch (ParseException e3) {
            e = e3;
            time = 0;
        }
        return time2 - time;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        try {
            new AlertDialog.Builder(this, R.style.AlertDialogCustom).setPositiveButton(R.string.text_yes, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (ShopeePayStatusActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                    ShopeePayStatusActivity.this.finish();
                }
            }).setNegativeButton(R.string.text_no, new DialogInterface.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (ShopeePayStatusActivity.this.isFinishing()) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).setTitle(R.string.cancel_transaction).setMessage(str).create().show();
            int i2 = connect + 101;
            read = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            String str2 = g;
            StringBuilder sb = new StringBuilder("showDialog:");
            sb.append(e2.getMessage());
            Logger.e(str2, sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:12:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x020d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0217  */
    /* JADX WARN: Code duplicated, block: B:42:0x0220  */
    /* JADX WARN: Code duplicated, block: B:44:0x0229  */
    /* JADX WARN: Code duplicated, block: B:47:0x0237  */
    /* JADX WARN: Code duplicated, block: B:49:0x0244  */
    /* JADX WARN: Code duplicated, block: B:51:0x024f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0258  */
    /* JADX WARN: Code duplicated, block: B:9:0x0093  */
    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException {
        int i;
        String transactionTime;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2;
        String gopayExpiration;
        int i3 = 2 % 2;
        int i4 = connect + 45;
        read = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            int i5 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i7 = (-1074585944) + (((~((-682414771) | i6)) | 545821234 | (~(1512402313 | i6))) * (-880));
            int i8 = (~((-682414771) | (~i6))) | (-1512402314);
            int i9 = ~(i6 | 682414770);
            if (i5 != i7 + ((i8 | i9) * (-880)) + (i9 * 880)) {
                i = read + 47;
                connect = i % 128;
                if (i % 2 == 0) {
                    int[] iArr = new int[1229045797];
                    iArr[1229045796] = 0;
                    Toast.makeText((Context) null, iArr[-1], 0).show();
                } else {
                    int[] iArr2 = new int[1229045797];
                    iArr2[1229045796] = 1;
                    int i10 = (-205535948) % 2;
                    Toast.makeText((Context) null, iArr2[-1], 1).show();
                }
            }
        } else {
            int i11 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i11 != (-1171487290) + (((~(1104265362 | iIdentityHashCode)) | 274277819) * (-366)) + (((~(iIdentityHashCode | 1373234619)) | 5308562) * 366)) {
                i = read + 47;
                connect = i % 128;
                if (i % 2 == 0) {
                    int[] iArr3 = new int[1229045797];
                    iArr3[1229045796] = 0;
                    Toast.makeText((Context) null, iArr3[-1], 0).show();
                } else {
                    int[] iArr4 = new int[1229045797];
                    iArr4[1229045796] = 1;
                    int i12 = (-205535948) % 2;
                    Toast.makeText((Context) null, iArr4[-1], 1).show();
                }
            }
        }
        int i13 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i14 = ~elapsedCpuTime;
        int i15 = (~((-53091428) | i14)) | 34211937;
        int i16 = ~(elapsedCpuTime | (-1750123269));
        if (i13 != (-1721388142) + ((i15 | i16) * (-502)) + ((i16 | (~(i14 | (-18879491)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw new RuntimeException("-221209597");
        }
        super.onCreate(bundle);
        setContentView(R.layout.uikit_activity_shopeepay_status);
        TransactionResponse transactionResponse = (TransactionResponse) getIntent().getSerializableExtra("extra.status");
        if (transactionResponse != null) {
            asBinder();
            final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.shopeepay_instruction_layout);
            this.INotificationSideChannel = (BoldTextView) findViewById(R.id.shopeepay_merchant_name);
            final DefaultTextView defaultTextView = (DefaultTextView) findViewById(R.id.shopeepay_instruction_toggle);
            defaultTextView.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        ShopeePayStatusActivity shopeePayStatusActivity = ShopeePayStatusActivity.this;
                        ((Boolean) ShopeePayStatusActivity.b(DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{shopeePayStatusActivity, Boolean.valueOf(!ShopeePayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(shopeePayStatusActivity))}, 397842385, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -397842385, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
                        if (ShopeePayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ShopeePayStatusActivity.this)) {
                            defaultTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231142, 0);
                            linearLayout.setVisibility(0);
                        } else {
                            defaultTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231139, 0);
                            linearLayout.setVisibility(8);
                        }
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            final String qrisUrl = transactionResponse.getQrisUrl();
            this.onTransact = (ImageView) findViewById(R.id.shopeepay_qr_code);
            FancyButton fancyButton = (FancyButton) findViewById(R.id.shopeepay_reload_qr_button);
            this.RemoteActionCompatParcelizer = fancyButton;
            setTextColor(fancyButton);
            FancyButton fancyButton2 = this.RemoteActionCompatParcelizer;
            int i17 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i17 != 0) {
                int i18 = read + 35;
                connect = i18 % 128;
                if (i18 % 2 == 0) {
                    fancyButton2.setIconColorFilter(i17);
                    obj.hashCode();
                    throw null;
                }
                fancyButton2.setIconColorFilter(i17);
            }
            this.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        ShopeePayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ShopeePayStatusActivity.this);
                        ShopeePayStatusActivity shopeePayStatusActivity = ShopeePayStatusActivity.this;
                        String str = qrisUrl;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        ShopeePayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(shopeePayStatusActivity, str, (ImageView) ShopeePayStatusActivity.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{shopeePayStatusActivity}, -734268689, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 734268690, iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.onTransact).TuitionPaymentFragmentbindingInflater1(qrisUrl).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new AnonymousClass1());
            this.cancelAll = (BoldTextView) findViewById(R.id.shopeepay_expiration_text);
            this.cancel = (DefaultTextView) findViewById(R.id.shopeepay_expiration_desc);
            String transactionTime2 = transactionResponse.getTransactionTime();
            if (TextUtils.isEmpty(transactionResponse.getGopayExpiration())) {
                int i19 = connect + 55;
                read = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 37 / 0;
                    if (TextUtils.isEmpty(transactionResponse.getGopayExpirationRaw())) {
                        int i21 = connect + 9;
                        read = i21 % 128;
                        int i22 = i21 % 2;
                        if (!TextUtils.isEmpty(transactionTime2)) {
                            int i23 = read + 85;
                            connect = i23 % 128;
                            int i24 = i23 % 2;
                            this.cancel.setVisibility(8);
                            this.cancelAll.setVisibility(8);
                            int i25 = connect + 81;
                            read = i25 % 128;
                            int i26 = i25 % 2;
                        }
                    }
                } else if (TextUtils.isEmpty(transactionResponse.getGopayExpirationRaw())) {
                    int i27 = connect + 9;
                    read = i27 % 128;
                    int i28 = i27 % 2;
                    if (!TextUtils.isEmpty(transactionTime2)) {
                        int i29 = read + 85;
                        connect = i29 % 128;
                        int i210 = i29 % 2;
                        this.cancel.setVisibility(8);
                        this.cancelAll.setVisibility(8);
                        int i211 = connect + 81;
                        read = i211 % 128;
                        int i212 = i211 % 2;
                    }
                }
                transactionTime = transactionResponse.getTransactionTime();
                if (TextUtils.isEmpty(transactionResponse.getGopayExpirationRaw())) {
                    if (TextUtils.isEmpty(transactionResponse.getGopayExpiration())) {
                        gopayExpiration = TuitionPaymentFragmentbindingInflater1(transactionResponse.getTransactionTime());
                    } else {
                        gopayExpiration = transactionResponse.getGopayExpiration();
                    }
                    jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentbindingInflater1(transactionTime, gopayExpiration);
                } else {
                    jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(transactionTime, transactionResponse.getGopayExpirationRaw());
                }
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 1000) {
                    i2 = connect;
                    int i30 = i2 + 49;
                    read = i30 % 128;
                    int i31 = i30 % 2;
                    if (this.cancelAll != null) {
                        int i32 = i2 + 35;
                        read = i32 % 128;
                        int i33 = i32 % 2;
                        if (this.cancel != null) {
                            new CountDownTimer(jTuitionPaymentFragmentspecialinlinedviewModeldefault3) { // from class: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.8
                                @Override // android.os.CountDownTimer
                                public final void onFinish() {
                                    ShopeePayStatusActivity.b(ShopeePayStatusActivity.this).setVisibility(8);
                                    ShopeePayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ShopeePayStatusActivity.this).setText(ShopeePayStatusActivity.this.getString(R.string.uikit_shopeepay_expiration_expired));
                                }

                                @Override // android.os.CountDownTimer
                                public final void onTick(long j) {
                                    BoldTextView boldTextViewB = ShopeePayStatusActivity.b(ShopeePayStatusActivity.this);
                                    StringBuilder sb = new StringBuilder(" ");
                                    sb.append(setInternalConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ShopeePayStatusActivity.this, j));
                                    sb.append(".");
                                    boldTextViewB.setText(sb.toString());
                                }
                            }.start();
                        }
                    }
                } else {
                    this.cancelAll.setVisibility(8);
                    this.cancel.setText(getString(R.string.uikit_shopeepay_expiration_expired));
                }
            } else {
                transactionTime = transactionResponse.getTransactionTime();
                if (TextUtils.isEmpty(transactionResponse.getGopayExpirationRaw())) {
                    if (TextUtils.isEmpty(transactionResponse.getGopayExpiration())) {
                        gopayExpiration = TuitionPaymentFragmentbindingInflater1(transactionResponse.getTransactionTime());
                    } else {
                        gopayExpiration = transactionResponse.getGopayExpiration();
                    }
                    jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentbindingInflater1(transactionTime, gopayExpiration);
                } else {
                    jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(transactionTime, transactionResponse.getGopayExpirationRaw());
                }
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 1000) {
                    i2 = connect;
                    int i34 = i2 + 49;
                    read = i34 % 128;
                    int i35 = i34 % 2;
                    if (this.cancelAll != null) {
                        int i36 = i2 + 35;
                        read = i36 % 128;
                        int i37 = i36 % 2;
                        if (this.cancel != null) {
                            new CountDownTimer(jTuitionPaymentFragmentspecialinlinedviewModeldefault3) { // from class: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.8
                                @Override // android.os.CountDownTimer
                                public final void onFinish() {
                                    ShopeePayStatusActivity.b(ShopeePayStatusActivity.this).setVisibility(8);
                                    ShopeePayStatusActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ShopeePayStatusActivity.this).setText(ShopeePayStatusActivity.this.getString(R.string.uikit_shopeepay_expiration_expired));
                                }

                                @Override // android.os.CountDownTimer
                                public final void onTick(long j) {
                                    BoldTextView boldTextViewB = ShopeePayStatusActivity.b(ShopeePayStatusActivity.this);
                                    StringBuilder sb = new StringBuilder(" ");
                                    sb.append(setInternalConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ShopeePayStatusActivity.this, j));
                                    sb.append(".");
                                    boldTextViewB.setText(sb.toString());
                                }
                            }.start();
                        }
                    }
                } else {
                    this.cancelAll.setVisibility(8);
                    this.cancel.setText(getString(R.string.uikit_shopeepay_expiration_expired));
                }
            }
            this.d.setText(getString(R.string.done));
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        ShopeePayStatusActivity shopeePayStatusActivity = ShopeePayStatusActivity.this;
                        ShopeePayStatusActivity.b(shopeePayStatusActivity, shopeePayStatusActivity.getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet));
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            this.d.setTextBold();
        }
        this.INotificationSideChannelDefault.setText(getString(R.string.uikit_shopeepay_status_title));
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 15;
            byte[] bArr = $$j;
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            m(s, (byte) s, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, packedPositionChild, packedPositionType, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        n(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int iRgb = (-16776185) - Color.rgb(0, 0, 0);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
            byte[] bArr2 = $$j;
            Object[] objArr5 = new Object[1];
            m((short) 52, bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, iRgb, modifierMetaStateMask, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = read + 35;
            connect = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i5 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                short s2 = (short) 104;
                Object[] objArr6 = new Object[1];
                m(s2, (byte) (s2 >>> 1), $$j[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i5, minimumFlingVelocity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i8 = (((-1330492805) + (((~((~layoutDirection) | 304537805)) | 546311218) * 446)) + (((~(layoutDirection | 850849023)) | 2506757) * 446)) - 798390592;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            n(127 - View.resolveSize(0, 0), null, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            n((ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-618299583};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1134, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 359942052, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int bitsPerPixel = 1030 - ImageFormat.getBitsPerPixel(0);
                    int iAlpha = 15 - Color.alpha(0);
                    byte[] bArr3 = $$j;
                    short s3 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    m(s3, (byte) s3, bArr3[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, bitsPerPixel, iAlpha, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.getDefaultSize(0, 0)), 1117 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 17 - View.MeasureSpec.makeMeasureSpec(0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRed = (char) Color.red(0);
                    int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
                    int iBlue = Color.blue(0) + 15;
                    short s4 = (short) 104;
                    Object[] objArr13 = new Object[1];
                    m(s4, (byte) (s4 >>> 1), $$j[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, trimmedLength, iBlue, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 29, null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 15;
                        byte[] bArr4 = $$j;
                        Object[] objArr16 = new Object[1];
                        m((short) 52, bArr4[7], bArr4[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, scrollBarFadeDuration, iIndexOf, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                        int iResolveSize = 15 - View.resolveSize(0, 0);
                        byte[] bArr5 = $$j;
                        short s5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        m(s5, (byte) s5, bArr5[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, doubleTapTimeout, iResolveSize, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i11 = connect + 43;
                    read = i11 % 128;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1108239194;
            int i18 = i15 + (-1263396177) + (((~(length | (-635112495))) | 879392664) * 191) + (((~((~length) | (-635112495))) | 608830472) * 191);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i21 = connect + 95;
                read = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr3) {
                    int i23 = read + 13;
                    connect = i23 % 128;
                    int i24 = i23 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i25 = i14 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i25) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i29 = ~System.identityHashCode(this);
            int i30 = i26 + (-1753597967) + (((~(i29 | 905559766)) | (~((-73935425) | i29))) * (-184)) + ((537952256 | (~((-611887681) | i29)) | (~(367607510 | i29))) * 184) + 1798910840;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[2])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
            Object[] objArr20 = new Object[1];
            m((short) 104, (byte) 15, $$j[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSize, keyRepeatDelay, scrollDefaultDelay, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                int iResolveSize2 = View.resolveSize(0, 0) + 1755;
                int i33 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr6 = $$j;
                Object[] objArr21 = new Object[1];
                m((short) 52, bArr6[7], bArr6[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, iResolveSize2, i33, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iMyPid = Process.myPid();
            int i34 = ~(915803611 | iMyPid);
            int i35 = (-662268591) + (((-1073741820) | i34) * (-814)) + ((i34 | (~((~iMyPid) | 703201185)) | 545262977) * 407) + (((~(iMyPid | (-703201186))) | (~((-915803612) | iMyPid)) | 545262977) * 407) + 76835219;
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i37 ^ (i37 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, null, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            n((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, null, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-618299583};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), 1726 - KeyEvent.getDeadChar(0, 0), 29 - TextUtils.getOffsetAfter("", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 76835219, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int iRed = 1755 - Color.red(0);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                byte[] bArr7 = $$j;
                Object[] objArr26 = new Object[1];
                m((short) 52, bArr7[7], bArr7[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumFlingVelocity, iRed, iResolveSizeAndState, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr27 = new Object[1];
                n(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_name_on_card).substring(0, 3).length() + 124, null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                n(127 - (KeyEvent.getMaxKeyCode() >> 16), null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                    int i38 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                    byte[] bArr8 = $$j;
                    Object[] objArr29 = new Object[1];
                    m((short) 141, bArr8[7], bArr8[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState, i38, iIndexOf2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                    int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                    Object[] objArr30 = new Object[1];
                    m((short) 104, (byte) 15, $$j[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollDefaultDelay2, iCombineMeasuredStates, modifierMetaStateMask2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr5 == null) {
                throw null;
            }
            int i39 = read + 67;
            connect = i39 % 128;
            int i40 = i39 % 2;
            while (i2 < strArr5.length) {
                int i41 = connect + 5;
                read = i41 % 128;
                if (i41 % 2 != 0) {
                    arrayList2.add(strArr5[i2]);
                    i2 += 7;
                } else {
                    arrayList2.add(strArr5[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i42 = connect + 45;
        read = i42 % 128;
        int i43 = i42 % 2;
        int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i45 = ~iIdentityHashCode;
        int i46 = i44 + (-408562839) + (((~(i45 | 809117876)) | (~(596515450 | i45)) | (-868104959)) * 464) + (((-271589509) | iIdentityHashCode) * (-464)) + (((~(iIdentityHashCode | 809117876)) | (-868104959)) * 464);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[3])[0] = i48 ^ (i48 << 5);
    }

    private static void n(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = INotificationSideChannelStubProxy;
        char c = '0';
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 47;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i4;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getEdgeSlop() >> 16)), 2993 - TextUtils.lastIndexOf("", c), 17 - View.MeasureSpec.getMode(i4), 1182129903, false, $$u(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myTid() >> 22) + 31339), TextUtils.lastIndexOf("", '0') + 2995, 17 - (ViewConfiguration.getTouchSlop() >> 8), 1182129903, false, $$u(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
                c = '0';
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(INotificationSideChannelStub)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        float f = 0.0f;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - ExpandableListView.getPackedPositionChild(0L)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 253, (ViewConfiguration.getLongPressTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (IconCompatParcelizer) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i7 = $11 + 21;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 33602), TextUtils.indexOf("", "", 0, 0) + 3085, 25 - TextUtils.indexOf((CharSequence) "", '0', 0), -2146875848, false, $$u(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (getInterfaceDescriptor) {
            int i9 = $11 + 57;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33602), 3085 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 26, -2146875848, false, $$u(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                f = 0.0f;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i11 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = connect + 83;
        read = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ~System.identityHashCode(this);
        if (i4 != 1839770923 + (((~(1185853949 | i5)) | (-355866407)) * (-983)) + (((~(i5 | (-355866407))) | 69603620) * 983)) {
            throw null;
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i8 = ~i7;
        int i9 = (~((-1554791665) | i8)) | 1084241040 | (~(1024264300 | i8));
        if (i6 != 2057588116 + (((~(i7 | (-553713677))) | i9) * 590) + (i9 * (-1180)) + (((~((-1024264301) | i8)) | (~(i8 | 1554791664))) * 590)) {
            throw null;
        }
        super.onResume();
        int i10 = connect + 95;
        read = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = read + 113;
        connect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i5 = ~iMaxMemory;
        if (i4 != (-1273806040) + ((1313412 | i5) * (-192)) + (((~(1100303005 | i5)) | 269002050) * (-384)) + (((~(iMaxMemory | (-1098989594))) | (~(i5 | 1369305055)) | (~((-269002051) | iMaxMemory))) * DerHeader.TAG_CLASS_PRIVATE)) {
            int i6 = (-961236258) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i9 = ~(560712184 | i8);
        if (i7 != 1223657628 + ((i9 | 2018343780) * 764) + (((~(i8 | 2018343780)) | 19038360) * (-1528)) + ((1495708316 | i9) * 764)) {
            int i10 = 1142546608 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i11 = read + 43;
        connect = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 28 / 0;
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ShopeePayStatusActivity shopeePayStatusActivity, boolean z) {
        Object[] objArr = {shopeePayStatusActivity, Boolean.valueOf(z)};
        return ((Boolean) b(DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, 397842385, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -397842385, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
    }

    public static /* synthetic */ ImageView TuitionPaymentFragmentbindingInflater1(ShopeePayStatusActivity shopeePayStatusActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (ImageView) b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{shopeePayStatusActivity}, -734268689, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 734268690, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ShapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iCodePointAt = 239391593 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_confirm_button).substring(1, 3).codePointAt(0);
        b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, -1410985125, 971771851 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step2).substring(0, 6).length(), 1410985127, iCodePointAt);
    }

    @Override // com.midtrans.sdk.uikit.abstracts.BasePaymentActivity, com.midtrans.sdk.uikit.abstracts.BaseActivity, com.akexorcist.localizationactivity.ui.LocalizationActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = connect + 13;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
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
    private static java.lang.String $$u(byte r5, short r6, short r7) {
        /*
            int r5 = r5 * 4
            int r5 = 4 - r5
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.$$m
            int r7 = 68 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r3 = r1[r5]
        L24:
            int r5 = r5 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.uikit.views.shopeepay.status.ShopeePayStatusActivity.$$u(byte, short, short):java.lang.String");
    }
}
