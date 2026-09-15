package com.bpjstku.presentation.promo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.complaint.ComplaintDataStore$$ExternalSyntheticLambda2;
import com.bpjstku.databinding.ActivityDetailVoucherBinding;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.promo.DetailVoucherActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/bpjstku/presentation/promo/DetailVoucherActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDetailVoucherBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DetailVoucherActivity extends BindingBaseActivity<ActivityDetailVoucherBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int asInterface;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, -15, -81, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 229;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f619a = 0;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i));
        int i11 = ~(i9 | i4);
        int i12 = i10 | i11;
        int i13 = ~i;
        int i14 = i11 | (~(i13 | i4));
        int i15 = (~(i5 | i7 | i13)) | (~(i13 | i9 | i4));
        int i16 = i + i4 + i3 + ((-1369571145) * i2) + ((-720088171) * i6);
        int i17 = i16 * i16;
        int i18 = (((-954023988) * i) - 252706816) + ((-260227018) * i4) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i3) + (565182464 * i2) + (1611661312 * i6) + ((-409206784) * i17);
        int i19 = ((i * (-1931095572)) - 2087550970) + (i4 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i3 * (-1931095207)) + (i2 * (-789048161)) + (i6 * 356376013) + (i17 * 423362560);
        int i20 = i18 + (i19 * i19 * (-1901854720));
        if (i20 != 1) {
            return i20 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.promo.DetailVoucherActivity.$$a
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r8 = 144 - r8
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r8 = r8 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailVoucherActivity.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.promo.DetailVoucherActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/promo/DetailVoucherActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) DetailVoucherActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDetailVoucherBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            DetailVoucherActivity$bindingInflater$1 detailVoucherActivity$bindingInflater$1 = DetailVoucherActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        DetailVoucherActivity$bindingInflater$1 detailVoucherActivity$bindingInflater$2 = DetailVoucherActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            return detailVoucherActivity$bindingInflater$2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityDetailVoucherBinding activityDetailVoucherBinding = (ActivityDetailVoucherBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityDetailVoucherBinding.btnRedeem.setOnClickListener(new View.OnClickListener() { // from class: CaptureSessionRepository1ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailVoucherActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityDetailVoucherBinding, view);
            }
        });
        activityDetailVoucherBinding.tvRedeemCode.setOnClickListener(new View.OnClickListener() { // from class: CropRegionZoomImpl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {activityDetailVoucherBinding, this, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                DetailVoucherActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, -164555671, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 164555673, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        DetailVoucherActivity detailVoucherActivity = this;
        Intrinsics.checkNotNullParameter(detailVoucherActivity, "");
        detailVoucherActivity.getWindow().addFlags(8192);
        ((ActivityDetailVoucherBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("Promo");
        ((ActivityDetailVoucherBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: releaseInstance
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                DetailVoucherActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 1883733778, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1883733778, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i3 % 128;
        int i4 = i3 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i5 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
            int trimmedLength = TextUtils.getTrimmedLength("") + 15;
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 141, $$a[3], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iResolveSizeAndState, trimmedLength, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{5, 4, 11, 18, 15, 7, 14, '\f', 18, 19, '\f', 1, 23, 16, 23, 2, 11, 4, '\f', 22, 15, 14}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{2, '\b', '\b', 24, 23, '\b', '\n', 23, 4, '\b', '\f', 2, '\t', '\n', 13836}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 23), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
            int gidForName = Process.getGidForName("") + 16;
            Object[] objArr5 = new Object[1];
            c((byte) 52, (short) 89, $$a[3], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, absoluteGravity, gidForName, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "");
                int iMyPid = 1031 - (Process.myPid() >> 22);
                int iGreen = 15 - Color.green(0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 37), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iMyPid, iGreen, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i10 = (int) Runtime.getRuntime().totalMemory();
            int i11 = ~(939130879 | i10);
            int i12 = (-1865304123) + ((76040801 | i11) * (-476)) + (i11 * 952) + ((~((~i10) | 939130879)) * 476) + 1543164697;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[2])[0] = i14 ^ (i14 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{19, 5, 4, 14, '\f', 6, 5, 4, 1, 14, 1, 22, 17, 23, 4, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima6).substring(8, 9).length() + 103), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).codePointAt(1) - 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{'\b', '\n', 4, 1, 20, 7, 23, 22, '\t', 5, 17, '\r', 2, 16, 18, '\b'}, (byte) (50 - Color.red(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1241137673};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 46039), 1134 - Color.argb(0, 0, 0, 0), View.MeasureSpec.getSize(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1543164697, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 1031;
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, (short) 141, $$a[3], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, iIndexOf, scrollDefaultDelay, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1117 - (ViewConfiguration.getEdgeSlop() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1031;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 37), b4, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf2, packedPositionGroup, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{5, 4, 11, 18, 15, 7, 14, '\f', 18, 19, '\f', 1, 23, 16, 23, 2, 11, 4, '\f', 22, 15, 14}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 17), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.done).substring(4, 5).length() + 21, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{2, '\b', '\b', 24, 23, '\b', '\n', 23, 4, '\b', '\f', 2, '\t', '\n', 13836}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 2), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, (short) 89, $$a[3], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, offsetBefore, maximumDrawingCacheSize, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int i15 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 15;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, (short) 141, $$a[3], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, i15, iIndexOf3, 1357589585, false, (String) objArr17[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iMyUid = Process.myUid();
            int i21 = ~iMyUid;
            int i22 = i18 + (((~(939392251 | i21)) | (~((-34669769) | iMyUid))) * 988) + 32264993 + (((~(iMyUid | 660442313)) | 278949938 | (~(i21 | (-34669769)))) * 988);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i25 = b + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                int i26 = i25 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i30 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step1).substring(24, 34).codePointAt(7) - 2052180192) | (-261348398));
            int i31 = i27 + 1776159939 + (((-505628568) | i30) * (-220)) + ((i30 | 26253352) * 220) + 1713182118;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c3 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
            int mirror = 'G' - AndroidCharacter.getMirror('0');
            byte b6 = (byte) ($$b & 63);
            Object[] objArr20 = new Object[1];
            c(b6, b6, $$a[3], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, scrollBarSize, mirror, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = b + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                Object[] objArr21 = new Object[1];
                c((byte) 52, (short) 89, $$a[3], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(mode, jumpTapTimeout, bitsPerPixel, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i36 = (((~((-153124865) | iFreeMemory)) | 33754169) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1075487404 + ((~((~iFreeMemory) | (-153124865))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 470018472;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i38 ^ (i38 << 5);
            i = b + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{19, 5, 4, 14, '\f', 6, 5, 4, 1, 14, 1, 22, 17, 23, 4, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 68), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{'\b', '\n', 4, 1, 20, 7, 23, 22, '\t', 5, 17, '\r', 2, 16, 18, '\b'}, (byte) (50 - Color.alpha(0)), 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1241137673};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42049), 1726 - View.MeasureSpec.getMode(0), 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 470018472);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int i39 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                Object[] objArr26 = new Object[1];
                c((byte) 52, (short) 89, $$a[3], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, i39, doubleTapTimeout, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{5, 4, 11, 18, 15, 7, 14, '\f', 18, 19, '\f', 1, 23, 16, 23, 2, 11, 4, '\f', 22, 15, 14}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step4).substring(0, 1).length() + 16), TextUtils.indexOf("", "") + 22, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{2, '\b', '\b', 24, 23, '\b', '\n', 23, 4, '\b', '\f', 2, '\t', '\n', 13836}, (byte) (ImageFormat.getBitsPerPixel(0) + 14), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                    int iIndexOf4 = 23 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, bArr[7], bArr[3], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState, longPressTimeout, iIndexOf4, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                    int longPressTimeout2 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i40 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b7 = (byte) ($$b & 63);
                    Object[] objArr30 = new Object[1];
                    c(b7, b7, $$a[3], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cKeyCodeFromString, longPressTimeout2, i40, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                b = i % 128;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i41 = i % 2;
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] == ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i42 % 128;
            int i43 = i42 % 2;
            int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i46 = ~i45;
            int i47 = i44 + (-1917404935) + ((138520881 | i46) * (-192)) + (((~(474066297 | i46)) | 548147842) * (-384)) + (((~(i45 | (-335545417))) | (~(i46 | 1022214139)) | (~((-548147843) | i45))) * DerHeader.TAG_CLASS_PRIVATE);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            ((int[]) objArr31[3])[0] = i49 ^ (i49 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr5 == null) {
            throw null;
        }
        int i50 = b + 81;
        while (true) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i50 % 128;
            int i51 = i50 % 2;
            if (i5 >= strArr5.length) {
                throw null;
            }
            int i52 = b + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i52 % 128;
            int i53 = i52 % 2;
            arrayList2.add(strArr5[i5]);
            i5++;
            i50 = b + 55;
        }
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        char c = '0';
        int i5 = 1770390596;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int iIndexOf = TextUtils.indexOf("", c, 0, 0) + 2268;
                        int i7 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 32;
                        byte b3 = (byte) ($$c[2] + 1);
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iIndexOf, i7, -1927765101, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                    c = '0';
                    i5 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        float f = 0.0f;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i8 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267;
            int modifierMetaStateMask = 32 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte b5 = (byte) ($$c[2] + 1);
            byte b6 = (byte) (b5 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, i8, modifierMetaStateMask, -1927765101, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
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
            int i9 = $11 + 53;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i10 = $11 + 69;
                    $10 = i10 % 128;
                    if (i10 % i3 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >> b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                } else {
                    try {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = deinitsession;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = deinitsession;
                        objArr4[9] = deinitsession;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = deinitsession;
                        objArr4[6] = deinitsession;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = deinitsession;
                        objArr4[3] = deinitsession;
                        objArr4[i3] = Integer.valueOf(cCharValue);
                        objArr4[1] = deinitsession;
                        objArr4[0] = deinitsession;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49267);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3262;
                            int i11 = (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 30;
                            byte b7 = $$c[i3];
                            byte b8 = (byte) (b7 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, iLastIndexOf, i11, -127612708, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i12 = $11 + 119;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22879 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 594, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i15 = $11 + 17;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        } else {
                            int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                i3 = 2;
                f = 0.0f;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 1002384850;
        if (i2 != ((~((~iCodePointAt) | 1049622263)) * 130) + 2073734936 + (((~(iCodePointAt | 1049622263)) | 201330688) * 130)) {
            int i3 = 1519206868 % 2;
            throw new ArithmeticException();
        }
        int i4 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i4 != 261580360 + (((~((-574704002) | iNextInt)) | (~((~iNextInt) | 2004351963))) * (-318)) + (((~(928504777 | iNextInt)) | 1075847186) * (-318)) + (((~(iNextInt | (-928504778))) | (-1650551188)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            b = i5 % 128;
            int i6 = i5 % 2;
            int[] iArr = new int[194814107];
            iArr[194814106] = 1;
            int i7 = 1745714494 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i8 = b + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
        }
        super.onResume();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        if (i4 != (-1162489546) + (((~(1166113358 | i5)) | 336125815) * (-366)) + (((~(i5 | 1435107199)) | 67131974) * 366)) {
            int[] iArr = new int[1568019014];
            iArr[1568019013] = 1;
            int i6 = 1482676446 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = b + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 2;
            }
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i10 = (int) Runtime.getRuntime().totalMemory();
        int i11 = (-1376584636) + ((1178083676 | i10) * 614);
        int i12 = ~i10;
        if (i9 != i11 + (((~((-737194509) | i12)) | 36708364 | (~(1841861456 | i12))) * (-1228)) + (((~(i12 | 1878569820)) | (~((-700486145) | i12))) * 614)) {
            throw null;
        }
        super.onStart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c0, code lost:
    
        if (r0 != (((470345608 + ((~((-1494624773) | r3)) * 623)) + (((~r3) | 2134168) * (-623))) + (((~(r3 | 543282680)) | ((~((-2035773285) | r3)) | 1494624772)) * 623))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c2, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.promo.DetailVoucherActivity.b + 57;
        com.bpjstku.presentation.promo.DetailVoucherActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ce, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d1, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00dc, code lost:
    
        throw new java.lang.RuntimeException("-178147694");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        r11 = 738239632 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004f, code lost:
    
        if (r3 == ((((-1539236256) + (((~((-1342534715) | r6)) | 512547171) * (-328))) + ((r5 | 512547171) * 164)) + ((((~(r5 | 1342534714)) | 243829057) | (~(r6 | (-1073816601)))) * 164))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0086, code lost:
    
        if (r3 == ((r8 + (((~(960803120 | r7)) | (-2080243000)) * (-1976))) + ((((~(r5 | 1790790663)) | 671350784) | (~((-1790790664) | r7))) * 988))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0088, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = new java.util.Random().nextInt();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[] r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailVoucherActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityDetailVoucherBinding activityDetailVoucherBinding, View view) {
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                activityDetailVoucherBinding.btnRedeem.setVisibility(63);
                activityDetailVoucherBinding.llRedeemSection.setVisibility(1);
            } else {
                activityDetailVoucherBinding.btnRedeem.setVisibility(8);
                activityDetailVoucherBinding.llRedeemSection.setVisibility(0);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ActivityDetailVoucherBinding activityDetailVoucherBinding = (ActivityDetailVoucherBinding) objArr[0];
        DetailVoucherActivity detailVoucherActivity = (DetailVoucherActivity) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[2]);
        try {
            String string = activityDetailVoucherBinding.tvRedeemCode.getText().toString();
            Object systemService = detailVoucherActivity.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", string));
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Link Copied", 0).show();
            detailVoucherActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.visionplus.id/payment/voucher")));
            ViewPortBuilder.b();
            int i2 = b + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        DetailVoucherActivity detailVoucherActivity = (DetailVoucherActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                detailVoucherActivity.finish();
                ViewPortBuilder.b();
                int i4 = 25 / 0;
            } else {
                detailVoucherActivity.finish();
                ViewPortBuilder.b();
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            b = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(ActivityDetailVoucherBinding activityDetailVoucherBinding, DetailVoucherActivity detailVoucherActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{activityDetailVoucherBinding, detailVoucherActivity, view}, -164555671, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 164555673, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DetailVoucherActivity detailVoucherActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{detailVoucherActivity, view}, 1883733778, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1883733778, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static {
        asInterface = 1;
        g();
        INSTANCE = new Companion(null);
        int i = f619a + 37;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 3;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        b = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_detail_voucher;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iB = ComplaintDataStore$$ExternalSyntheticLambda2.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, bundle}, -258888598, ComplaintDataStore$$ExternalSyntheticLambda2.b(), ComplaintDataStore$$ExternalSyntheticLambda2.b(), 258888599, iB, ComplaintDataStore$$ExternalSyntheticLambda2.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{60053, 60088, 60072, 60062, 60060, 60050, 60057, 60055, 60083, 60058, 60048, 60117, 60051, 60063, 60054, 60049, 60041, 60052, 60040, 60056, 60073, 60034, 60047, 60043, 60045};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            int r6 = 116 - r6
            byte[] r0 = com.bpjstku.presentation.promo.DetailVoucherActivity.$$c
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailVoucherActivity.$$i(short, byte, byte):java.lang.String");
    }
}
