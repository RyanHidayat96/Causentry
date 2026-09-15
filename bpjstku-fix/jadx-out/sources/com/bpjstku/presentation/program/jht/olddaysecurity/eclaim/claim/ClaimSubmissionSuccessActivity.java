package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.databinding.ActivityClaimSubmissionSuccessBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/claim/ClaimSubmissionSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityClaimSubmissionSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "asBinder", "a", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClaimSubmissionSuccessActivity extends BindingBaseActivity<ActivityClaimSubmissionSuccessBinding> {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 26, 11, 7, 24, -30, 36, 26, -8, 18, -14, 32, 12, 8, 25, -32, 48, 17, -4, 24, 7, -2, 22, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$k = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private static final byte[] $$a = {63, 56, -36, -117, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 66;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.$$a
            int r8 = r8 + 4
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r7 = r6
            r3 = r8
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L1f:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L27:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 30
            int r0 = r6 + 23
            int r5 = r5 * 13
            int r5 = 97 - r5
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.$$j
            int r7 = r7 * 22
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 22
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r5
            r5 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2b:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.f(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityClaimSubmissionSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ClaimSubmissionSuccessActivity$bindingInflater$1 claimSubmissionSuccessActivity$bindingInflater$1 = ClaimSubmissionSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return claimSubmissionSuccessActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityClaimSubmissionSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnOk;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: invokePostCapture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimSubmissionSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            ClaimSubmissionSuccessActivity claimSubmissionSuccessActivity = this;
            Intrinsics.checkNotNullParameter(claimSubmissionSuccessActivity, "");
            claimSubmissionSuccessActivity.getWindow().addFlags(1116);
        } else {
            ClaimSubmissionSuccessActivity claimSubmissionSuccessActivity2 = this;
            Intrinsics.checkNotNullParameter(claimSubmissionSuccessActivity2, "");
            claimSubmissionSuccessActivity2.getWindow().addFlags(8192);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        super.onPause();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int iAxisFromString = 9 - MotionEvent.axisFromString("");
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) (-bArr[26]), (byte) (-bArr[12]), bArr[24], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, windowTouchSlop, iAxisFromString, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_no_face).substring(13, 14).codePointAt(0) + 127, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step3).substring(35, 41).length() + 16, (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_invalid).substring(0, 6).length() + 226, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_card_register_success).substring(11, 12).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iArgb = 876 - Color.argb(0, 0, 0, 0);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[24], (byte) (-bArr2[17]), (short) (-bArr2[26]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop2, iArgb, absoluteGravity, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr3[146], (byte) (-bArr3[12]), (short) (-bArr3[26]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, doubleTapTimeout, minimumFlingVelocity, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i6 = ~i5;
            int i7 = 332987072 + (((~((-145171969) | i6)) | (~((-285739473) | i5)) | (~(535773179 | i5))) * 765) + (((~((-430911441) | i6)) | 145171968) * 1530) + (((~(i5 | (-430911441))) | (~(i6 | 535773179))) * 765) + 1357096012;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 216, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, TextUtils.indexOf("", "", 0, 0) + 2, new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_primary_cta_text).substring(0, 6).codePointAt(4) + 114, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_mandiri_details).substring(87, 89).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 101, new char[]{2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r'}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), 1357096012};
                byte[] bArr4 = $$j;
                byte b2 = bArr4[29];
                byte b3 = b2;
                Object[] objArr11 = new Object[1];
                f(b2, b3, b3, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b4 = (byte) (-bArr4[27]);
                byte b5 = b4;
                Object[] objArr12 = new Object[1];
                f(b4, b5, b5, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                    int mode = View.MeasureSpec.getMode(0) + 10;
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr5[146], (byte) (-bArr5[12]), (short) (-bArr5[26]), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iResolveSizeAndState, mode, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 227, Color.alpha(0) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_object_active).substring(3, 4).codePointAt(0) - 79, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 221, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr6 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr6[24], (byte) (-bArr6[17]), (short) (-bArr6[26]), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, pressedStateDuration, packedPositionChild, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) (-bArr7[26]), (byte) (-bArr7[12]), bArr7[24], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iLastIndexOf, iIndexOf, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i15 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i16 = ~i15;
            int i17 = i14 + (-969231177) + (((~((-163546740) | i16)) | (~(i15 | (-123236511)))) * 333) + (((~(i15 | (-163546740))) | (~(i16 | (-123236511)))) * 333);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[1])[0] = i19 ^ (i19 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            while (i2 < strArr.length) {
                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                int i21 = i20 % 2;
                arrayList.add(strArr[i2]);
                i2++;
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        throw new RuntimeException(String.valueOf(i13));
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $11 + 115;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3291, 31 - Drawable.resolveOpacity(0, 0), 1199271174, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf("", "", 0) + 651, 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -450685997, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i8 = $11 + 31;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 101;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i12 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr4[i11] = cArr2[0];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 651 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 44, -450685997, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    try {
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, -450685997, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iMyPid = 1031 - (Process.myPid() >> 22);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[24], (short) (-bArr[7]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iMyPid, longPressTimeout, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 217, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, Drawable.resolveOpacity(0, 0) + 22, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_installment).substring(12, 13).codePointAt(0) + 122, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_email).substring(0, 5).length() + 10, View.combineMeasuredStates(0, 0) + 9, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 15;
            byte b2 = $$a[24];
            Object[] objArr5 = new Object[1];
            c((byte) 52, b2, (short) (b2 | 69), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, fadingEdgeLength, iIndexOf, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b3 = $$a[24];
                Object[] objArr6 = new Object[1];
                c(b3, (byte) (b3 | 14), (short) 121, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, packedPositionType, edgeSlop, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i7 = ~((-152779516) | (~i6));
            int i8 = ((((73662468 | i7) | (~(152779515 | i6))) * (-338)) - 627609423) + (((~(i6 | 226441983)) | i7) * 338) + 1757815101;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_folder).substring(0, 6).codePointAt(4) + 126, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.klik_bca_continue).substring(39, 48).length() + 7, 2 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, TextUtils.getTrimmedLength("") + 231, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, new char[]{2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r'}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-370636386};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46037), 1134 - TextUtils.indexOf("", "", 0), 18 - (Process.myTid() >> 22), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1757815101, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int defaultSize = 1031 - View.getDefaultSize(0, 0);
                    int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, bArr2[24], (short) (-bArr2[7]), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, defaultSize, iIndexOf2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionGroup(0L) + 45993), 1117 - (KeyEvent.getMaxKeyCode() >> 16), 17 - Color.alpha(0)), Boolean.TYPE});
                }
                Object[] objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int i11 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    byte b4 = $$a[24];
                    Object[] objArr14 = new Object[1];
                    c(b4, (byte) (b4 | 14), (short) 121, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, i11, scrollBarSize, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step3).substring(17, 18).codePointAt(0) + 118, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_deeplink).substring(1, 2).codePointAt(0) - 75, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1059).substring(0, 54).length() - 32, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 196, (Process.myTid() >> 22) + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int jumpTapTimeout2 = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i12 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte b5 = $$a[24];
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, b5, (short) (b5 | 69), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout, jumpTapTimeout2, i12, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                        byte[] bArr3 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr3[24], (short) (-bArr3[7]), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyTid, i13, absoluteGravity, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr13;
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
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i22 = ~i21;
        int i23 = i18 + (-1007564738) + (((~((-312579760) | i22)) | 68299589) * (-865)) + ((~(i21 | 312579759)) * 865) + (((~(68299589 | i22)) | (~(i22 | 312579759))) * 865);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr19[2])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
            int mirror = AndroidCharacter.getMirror('0') + 1707;
            int jumpTapTimeout3 = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr4 = $$a;
            byte b6 = (byte) (bArr4[15] - 1);
            byte b7 = bArr4[24];
            Object[] objArr20 = new Object[1];
            c(b6, b7, (short) (b7 | 121), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(capsMode, mirror, jumpTapTimeout3, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i26 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b8 = $$a[24];
                Object[] objArr21 = new Object[1];
                c((byte) 52, b8, (short) (b8 | 69), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, keyRepeatDelay, i26, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode;
            int i28 = 1112438523 + (((~((-259723705) | i27)) | (~(iIdentityHashCode | (-47121279)))) * 333) + (((~(iIdentityHashCode | (-259723705))) | (~(i27 | (-47121279)))) * 333) + 1841709086;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 228, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, 3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 195, AndroidCharacter.getMirror('0') - ' ', ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 31, new char[]{2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r'}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-370636386};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') + 1678, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1841709086, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                byte b9 = $$a[24];
                Object[] objArr26 = new Object[1];
                c((byte) 52, b9, (short) (b9 | 69), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout2, scrollDefaultDelay, iIndexOf3, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(true, (Process.myPid() >> 22) + 228, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).codePointAt(10) - 92, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).length() + 231, 15 - View.combineMeasuredStates(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_expiration_message).substring(3, 4).length() + 8, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveOpacity2 = (char) (29944 - Drawable.resolveOpacity(0, 0));
                    int i31 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                    int iAlpha = Color.alpha(0) + 23;
                    byte b10 = $$a[24];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, b10, (short) (b10 | 158), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveOpacity2, i31, iAlpha, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i32 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iBlue = 23 - Color.blue(0);
                    byte[] bArr5 = $$a;
                    byte b11 = (byte) (bArr5[15] - 1);
                    byte b12 = bArr5[24];
                    Object[] objArr30 = new Object[1];
                    c(b11, b12, (short) (b12 | 121), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(modifierMetaStateMask, i32, iBlue, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i34 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i34 == i33) {
            int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
            int i36 = i35 % 2;
            int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i38 = i37 + 631833220 + (((~(iIdentityHashCode2 | 273296432)) | 60035526) * 305) + (((~((~iIdentityHashCode2) | 273296432)) | 60694006) * 305);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[3])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr4 != null) {
            int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i41 % 128;
            int i42 = i41 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i34];
        int i43 = i34 - 1;
        iArr[i43] = 1;
        Toast.makeText((Context) null, iArr[((i34 * i43) % 2) - 1], 1).show();
        int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 463309903;
        int i45 = ~(748535251 | length);
        int i46 = ~length;
        int i47 = i44 + 1870095203 + ((i45 | (~((-76820947) | i46))) * (-406)) + ((~(1037958623 | i46)) * (-406)) + (((~(length | (-961137678))) | (~((-748535252) | i46))) * 406);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr32[3])[0] = i49 ^ (i49 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ee, code lost:
    
        if (r1 != (((-1082856870) + (((~(r2 | 873312930)) | (-1974448827)) * 305)) + (((~((~r2) | 873312930)) | (-1705743035)) * 305))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f0, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0104, code lost:
    
        throw new java.lang.RuntimeException("108197934");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010c, code lost:
    
        throw new java.lang.RuntimeException("1129752728");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        if (r1 == ((r9 + ((r8 | (~(865844207 | r6))) * 50)) + (((~(r6 | 18452620)) | ((~(848440163 | r6)) | (-865844208))) * 50))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0098, code lost:
    
        if (r1 == (((1179459624 + (((~(r7 | 512811084)) | ((~(1342798627 | r7)) | (-1587149680))) * 464)) + (((-244351053) | r6) * (-464))) + (((~(r6 | 512811084)) | (-1587149680)) * 464))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009a, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.mandiri_click_pay_instruction_step2).substring(0, 3).codePointAt(1) - 1631631356;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = ~startUptimeMillis;
        if (i4 != 1125317536 + (((~((-816671752) | i5)) | (~(1646659294 | i5))) * (-867)) + (((~((-816671752) | startUptimeMillis)) | 277440513 | (~(1646659294 | startUptimeMillis))) * (-1734)) + (((~(startUptimeMillis | 1924099807)) | (~(i5 | (-277440514))) | (~((-539231239) | startUptimeMillis))) * 867)) {
            throw null;
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i7 = ~iIdentityHashCode;
        int i8 = (~((-2105395160) | i7)) | 473515397;
        int i9 = ~(iIdentityHashCode | 2105540567);
        if (i6 != ((i8 | i9) * (-252)) + 1645851720 + ((i9 | (~(i7 | (-1631879763)))) * 252)) {
            throw new RuntimeException("-1758747844");
        }
        super.onStart();
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        if (i4 != ((~((~i5) | 1070579647)) * 130) + 2011910056 + (((~(i5 | 1070579647)) | 222763648) * 130)) {
            int i6 = 881707106 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        if (i7 != (((-1906588608) + (((-8552533) | i8) * (-381))) + (((~((~i8) | 1999469192)) | (-1436987485)) * 381)) - 1036452604) {
            int i9 = (-1219207508) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 18 / 0;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i6);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i3 | i6)) | i10;
        int i13 = (~(i6 | i3 | i4)) | (~(i8 | (~i4)));
        int i14 = i3 + i4 + i + ((-2005657349) * i5) + (1476006321 * i2);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i3) - 1319501824) + (407026429 * i4) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i) + ((-798228480) * i5) + ((-1404829696) * i2) + ((-1043726336) * i15);
        int i17 = (i3 * 961754349) + 784684277 + (i4 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i * 961754313) + (i5 * (-1264871149)) + (i2 * 72538105) + (i15 * 798621696);
        if (i16 + (i17 * i17 * (-1437204480)) == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i18 = 2 % 2;
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    static {
        b = 0;
        g();
        INSTANCE = new Companion(null);
        int i = d + 17;
        b = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentbindingInflater1 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, 1451685622, -1451685621, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault1)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentbindingInflater1 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = VocationProfileRequest.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater2, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 267348738, -267348738, iTuitionPaymentFragmentbindingInflater3, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722269;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_claim_submission_success);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, int r8) {
        /*
            int r7 = r7 + 119
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.$$c
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimSubmissionSuccessActivity.$$i(short, int, int):java.lang.String");
    }
}
