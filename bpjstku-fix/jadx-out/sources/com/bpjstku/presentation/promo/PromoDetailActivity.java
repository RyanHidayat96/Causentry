package com.bpjstku.presentation.promo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityPromoDetailBinding;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.bumptech.glide.Glide;
import com.google.android.gms.internal.mlkit_common.zzbb;
import defpackage.CameraUseCaseAdapter;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.lambdacreateCameraSelectorById0;
import defpackage.requestClose;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/promo/PromoDetailActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPromoDetailBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/promo/Promo;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/promo/Promo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromoDetailActivity extends BindingBaseActivity<ActivityPromoDetailBinding> {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Promo TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {58, 66, -1, 15};
    private static final int $$f = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, 66, -14, -31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 143;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f621a = 1;
    private static int asInterface = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws IllegalAccessException {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~((~i5) | i7 | i)) | (~(i8 | i4));
        int i12 = i4 + i + i3 + (531708263 * i6) + ((-608630064) * i2);
        int i13 = i12 * i12;
        int i14 = (i4 * (-228234701)) + 730857472 + ((-228234701) * i) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i3) + ((-45088768) * i6) + ((-419430400) * i2) + ((-1471938560) * i13);
        int i15 = ((i4 * (-1679524527)) - 150938974) + (i * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i3 * (-1679524245)) + (i6 * (-166744051)) + (i2 * 2062148848) + (i13 * (-865337344));
        if (i14 + (i15 * i15 * (-1617166336)) != 1) {
            PromoDetailActivity promoDetailActivity = (PromoDetailActivity) objArr[0];
            int i16 = 2 % 2;
            int i17 = f621a + 83;
            g = i17 % 128;
            int i18 = i17 % 2;
            PromoDetailActivity promoDetailActivity2 = promoDetailActivity;
            Intrinsics.checkNotNullParameter(promoDetailActivity2, "");
            promoDetailActivity2.getWindow().addFlags(8192);
            promoDetailActivity.TuitionPaymentFragmentbindingInflater1(((ActivityPromoDetailBinding) ((ViewBinding) promoDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
            ((ActivityPromoDetailBinding) ((ViewBinding) promoDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(promoDetailActivity.getString(R.string.title_promo_detail));
            ImageView imageView = ((ActivityPromoDetailBinding) ((ViewBinding) promoDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgPromoDetail;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            PromoDetailActivity promoDetailActivity3 = promoDetailActivity;
            Promo promo = promoDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (promo == null) {
                int i19 = g + 111;
                f621a = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                promo = null;
            }
            String str = promo.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(promoDetailActivity3, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (!(!lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(promoDetailActivity3))) {
                Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(promoDetailActivity3).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str).into(imageView);
            }
        } else {
            PromoDetailActivity promoDetailActivity4 = (PromoDetailActivity) objArr[0];
            int i21 = 2 % 2;
            int i22 = g + 63;
            f621a = i22 % 128;
            int i23 = i22 % 2;
            if (((Field) CameraUseCaseAdapter.b[0]).getInt(null) != (((~((-991969443) | i8)) | 320864386) * (-241)) + 212793286 + (((~((-671105057) | i8)) | (-2142821372)) * 241)) {
                int i24 = (-1302137040) % 2;
                throw new ArithmeticException();
            }
            int i25 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            if (i25 != (-545098256) + ((~(2063584935 | startElapsedRealtime)) * 623) + (((~startElapsedRealtime) | 268469252) * (-623)) + (((~(startElapsedRealtime | 308071428)) | (~(2023982759 | startElapsedRealtime)) | (-2063584936)) * 623)) {
                throw null;
            }
            super.onStart();
            int i26 = g + 45;
            f621a = i26 % 128;
            int i27 = i26 % 2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r7 = 145 - r7
            byte[] r1 = com.bpjstku.presentation.promo.PromoDetailActivity.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r6
            int r7 = r7 + (-11)
            int r6 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.PromoDetailActivity.c(byte, short, short, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPromoDetailBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 11;
        f621a = i2 % 128;
        int i3 = i2 % 2;
        PromoDetailActivity$bindingInflater$1 promoDetailActivity$bindingInflater$1 = PromoDetailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = g + 41;
        f621a = i4 % 128;
        if (i4 % 2 != 0) {
            return promoDetailActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f621a + 35;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra(NotificationCompat.CATEGORY_PROMO);
            Intrinsics.checkNotNull(parcelableExtra);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (Promo) parcelableExtra;
            int i3 = 89 / 0;
        } else {
            Parcelable parcelableExtra2 = getIntent().getParcelableExtra(NotificationCompat.CATEGORY_PROMO);
            Intrinsics.checkNotNull(parcelableExtra2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (Promo) parcelableExtra2;
        }
        int i4 = f621a + 55;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f621a + 91;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = g + 25;
                f621a = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i5 = 5 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
                int i6 = f621a + 55;
                g = i6 % 128;
                int i7 = i6 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i8 = f621a + 43;
            g = i8 % 128;
            int i9 = i8 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = f621a + 63;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
            int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
            byte b2 = $$a[132];
            Object[] objArr2 = new Object[1];
            c(b2, (short) (b2 | 140), (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, absoluteGravity, maxKeyCode, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{21, 1, 24, 2, 5, 22, 21, 2, 5, 2, 0, 11, 4, 1, 7, '\n', 4, '\f', '\t', '\b', 5, 19}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1055).substring(0, 28).codePointAt(23) - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{'\r', 7, 21, 16, 2, '\n', 23, '\f', 11, 17, '\t', 6, 22, 0, 13898}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_due_amount).substring(8, 9).codePointAt(0) + 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
            int i4 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte b3 = $$a[132];
            Object[] objArr5 = new Object[1];
            c(b3, (short) (b3 | 88), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, capsMode, i4, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = f621a + 101;
            g = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b5, (short) (b5 | 37), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, i7, packedPositionChild, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1158415456;
            int i10 = (((612356473 + (((~((-278375437) | (~length))) | (~((-34095267) | length))) * (-272))) + (((~((-888647262) | length)) | 610271825) * (-272))) + (((~(length | 888647261)) | (-644367092)) * 272)) - 1031745933;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{18, 17, 21, 18, 3, 6, 21, 1, 16, 3, '\r', 0, 5, '\n', 17, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 41), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{21, 23, 11, 22, '\n', 0, '\b', 0, 11, 21, 4, 20, '\f', '\t', 2, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 18), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1459067034};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 46039), Drawable.resolveOpacity(0, 0) + 1134, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1031745933, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cBlue = (char) Color.blue(0);
                    int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iRgb = (-16777201) - Color.rgb(0, 0, 0);
                    byte b6 = $$a[132];
                    Object[] objArr12 = new Object[1];
                    c(b6, (short) (b6 | 140), (byte) 52, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, iIndexOf, iRgb, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45993), (ViewConfiguration.getScrollBarSize() >> 8) + 1117, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int iAlpha = 1031 - Color.alpha(0);
                    int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr13 = new Object[1];
                    c(b8, (short) (b8 | 37), b7, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode2, iAlpha, keyRepeatTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{21, 1, 24, 2, 5, 22, 21, 2, 5, 2, 0, 11, 4, 1, 7, '\n', 4, '\f', '\t', '\b', 5, 19}, (byte) (View.getDefaultSize(0, 0) + 84), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_delete).substring(1, 2).codePointAt(0) - 79, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{'\r', 7, 21, 16, 2, '\n', 23, '\f', 11, 17, '\t', 6, 22, 0, 13898}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_internal_detection_error_detected_image_is_null).substring(0, 24).length() + 51), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                        int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
                        byte b9 = $$a[132];
                        Object[] objArr16 = new Object[1];
                        c(b9, (short) (b9 | 88), (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, packedPositionGroup, iLastIndexOf, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0');
                        int iResolveSize = View.resolveSize(0, 0) + 15;
                        byte b10 = $$a[132];
                        Object[] objArr17 = new Object[1];
                        c(b10, (short) (b10 | 140), (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild2, iLastIndexOf2, iResolveSize, 1357589585, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iNextInt = new Random().nextInt();
            int i18 = 1602036951 + (((~((-487600013) | iNextInt)) | 201327616 | (~((-243319843) | iNextInt))) * (-754));
            int i19 = ~((-201327617) | iNextInt);
            int i20 = ~iNextInt;
            int i21 = i15 + i18 + ((i19 | (~((-41992227) | i20))) * (-754)) + ((i20 | (-487600013)) * 754);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i27 = ~(System.identityHashCode(this) | (-52776677));
            int i28 = i24 + (((-330694383) | i27) * (-196)) + 1215395013 + ((i27 | 277917706) * 196);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr19[2])[0] = i30 ^ (i30 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
            int i31 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
            int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte b11 = $$a[132];
            short s = (short) (b11 | 36);
            Object[] objArr20 = new Object[1];
            c(b11, s, (byte) s, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mirror, i31, doubleTapTimeout, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iLastIndexOf3 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int i32 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                byte b12 = $$a[132];
                Object[] objArr21 = new Object[1];
                c(b12, (short) (b12 | 88), (byte) 52, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, iLastIndexOf3, i32, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).length() + 1612424795;
            int i33 = 1878469249 + ((262992582 | length2) * 376) + (((~((~length2) | 774671497)) | 25195078) * (-376)) + (((~(length2 | (-774671498))) | (-562069072)) * 376) + 1423233076;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{18, 17, 21, 18, 3, 6, 21, 1, 16, 3, '\r', 0, 5, '\n', 17, 7}, (byte) (77 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step5).substring(28, 29).length() + 15, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{21, 23, 11, 22, '\n', 0, '\b', 0, 11, 21, 4, 20, '\f', '\t', 2, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).codePointAt(0) - 64, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1459067034};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - KeyEvent.keyCodeFromString("")), ((byte) KeyEvent.getModifierMetaStateMask()) + 1727, ((byte) KeyEvent.getModifierMetaStateMask()) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1423233076);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int windowTouchSlop2 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte b13 = $$a[132];
                Object[] objArr26 = new Object[1];
                c(b13, (short) (b13 | 88), (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, windowTouchSlop2, iMakeMeasureSpec, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{21, 1, 24, 2, 5, 22, 21, 2, 5, 2, 0, 11, 4, 1, 7, '\n', 4, '\f', '\t', '\b', 5, 19}, (byte) (AndroidCharacter.getMirror('0') + Typography.dollar), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{'\r', 7, 21, 16, 2, '\n', 23, '\f', 11, 17, '\t', 6, 22, 0, 13898}, (byte) (75 - Color.blue(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0));
                    int mirror2 = AndroidCharacter.getMirror('0') + 1707;
                    int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr = $$a;
                    byte b14 = bArr[132];
                    short s2 = bArr[7];
                    Object[] objArr29 = new Object[1];
                    c(b14, s2, (byte) (s2 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf2, mirror2, bitsPerPixel, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                    int iMyPid = 1755 - (Process.myPid() >> 22);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 23;
                    byte b15 = $$a[132];
                    short s3 = (short) (b15 | 36);
                    Object[] objArr30 = new Object[1];
                    c(b15, s3, (byte) s3, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout, iMyPid, iIndexOf2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr5 != null) {
                int i38 = f621a + 93;
                g = i38 % 128;
                int i39 = i38 % 2;
                for (String str2 : strArr5) {
                    int i40 = g + 119;
                    f621a = i40 % 128;
                    int i41 = i40 % 2;
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int length3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_mandiri).substring(15, 17).length() - 1614387026;
        int i43 = ~(45527077 | length3);
        int i44 = ~length3;
        int i45 = i43 | (~(258129503 | i44));
        int i46 = ~((-45527078) | i44);
        int i47 = i42 + (-1855370715) + ((i45 | i46) * (-516)) + (((~(length3 | (-222301787))) | (~((-35827718) | i44))) * 516) + ((35827717 | i46) * 516);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr31[3])[0] = i49 ^ (i49 << 5);
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = 1770390596;
        long j = 0;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i6 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 2267;
                        int i7 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 32;
                        byte b3 = (byte) ($$c[2] + 1);
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, i6, i7, -1927765101, false, $$i(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
                    j = 0;
                    f = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 2267;
            int iGreen = 33 - Color.green(0);
            byte b5 = (byte) ($$c[2] + 1);
            byte b6 = (byte) (b5 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, iIndexOf, iGreen, -1927765101, false, $$i(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 45;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $10 + 79;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
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
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 49267);
                        int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3260;
                        int gidForName = Process.getGidForName("") + 31;
                        byte b7 = (byte) ($$c[2] + 1);
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, i11, gidForName, -127612708, false, $$i(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i12 = $10 + 119;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) (22879 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int iMyPid = 594 - (Process.myPid() >> 22);
                            int i14 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16;
                            byte b9 = (byte) ($$c[2] + 1);
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iMyPid, i14, 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i16 = $10 + 41;
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
                int i22 = $10 + 17;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                obj2 = obj;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -292022343
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.PromoDetailActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i4 = 1856527076 + ((i3 | 900361563) * (-50));
        int i5 = ~((-277374282) | i3);
        int i6 = ~i3;
        if (i2 != i4 + ((i5 | (~(2007723387 | i6))) * 50) + (((~(i6 | 900361563)) | (~(1730349106 | i6)) | (-2007723388)) * 50)) {
            int i7 = 1801369580 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        if (i8 != (-1622509944) + (((~((-1701969732) | i9)) | 877086233) * (-90)) + (((~((-1701969732) | iIdentityHashCode)) | (-1970798428)) * (-45)) + (((~(iIdentityHashCode | (-877086234))) | (-1701969732) | (~(i9 | 877086233))) * 45)) {
            int[] iArr = new int[905444882];
            iArr[905444881] = 1;
            int i10 = (-2132034766) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i11 = g + 93;
            f621a = i11 % 128;
            int i12 = i11 % 2;
        }
        super.onCreate(bundle);
        int i13 = g + 75;
        f621a = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asInterface + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 3;
        f621a = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_promo_detail;
        }
        int i3 = 0 / 0;
        return R.layout.activity_promo_detail;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f621a + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = g + 79;
        f621a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = f621a + 87;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f621a + 87;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iCodePointAt = (-502455271) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(547730140, (-1547674786) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_alto).substring(45, 50).length(), iCodePointAt, -547730140, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(-805993686, zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 805993687, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_deeplink).substring(1, 2).length() - 1023197123);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 85;
        f621a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = g + 93;
        f621a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{60040, 60117, 60054, 60034, 60041, 60047, 60083, 60052, 60055, 60056, 60072, 60043, 60062, 60073, 60088, 60048, 60058, 60049, 60060, 60042, 60050, 60053, 60063, 60045, 60051};
        b = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, byte r6, int r7) {
        /*
            byte[] r0 = com.bpjstku.presentation.promo.PromoDetailActivity.$$c
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r6 = 116 - r6
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r4 = r5
            r6 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.PromoDetailActivity.$$i(int, byte, int):java.lang.String");
    }
}
