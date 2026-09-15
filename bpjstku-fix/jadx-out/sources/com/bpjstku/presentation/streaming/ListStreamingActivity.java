package com.bpjstku.presentation.streaming;

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
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityListStreamingBinding;
import com.bpjstku.databinding.ActivityVocationalTrainingDetilInformationBinding;
import com.bpjstku.presentation.streaming.ListStreamingActivity;
import com.bpjstku.presentation.util.NewWebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/streaming/ListStreamingActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityListStreamingBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListStreamingActivity extends BindingBaseActivity<ActivityListStreamingBinding> {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long b;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {106, -66, 28, 119, -6, 23, -41, 38, 20, 0, 21, -9, -19, 35, 10, 25, 3, 11, 15, -33, 42, 5, 15, -5, 3, 9, 21, -70, 70, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
    private static final int $$k = 163;
    private static final byte[] $$a = {58, 66, -1, 15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 166;
    private static int asBinder = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f632a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~i3;
        int i10 = ~i2;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i6 | i2)) | (~(i7 | i9 | i10));
        int i13 = i3 + i2 + i4 + ((-1136091917) * i) + (376669458 * i5);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i3) + 1718550528 + ((-1748215485) * i2) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i4) + ((-2044854272) * i) + (41156608 * i5) + (1721171968 * i14);
        int i16 = ((i3 * (-924404593)) - 1636593565) + (i2 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i4 * (-924404175)) + (i * (-2083730301)) + (i5 * 182666354) + (i14 * (-51970048));
        return i15 + ((i16 * i16) * (-653721600)) != 1 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 145 - r9
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.streaming.ListStreamingActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + 1
            int r7 = r7 + r9
            int r7 = r7 + (-11)
            r9 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.ListStreamingActivity.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 31
            int r8 = 115 - r8
            int r7 = r7 + 4
            int r6 = r6 * 27
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.presentation.streaming.ListStreamingActivity.$$j
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.ListStreamingActivity.f(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.streaming.ListStreamingActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/streaming/ListStreamingActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) ListStreamingActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityListStreamingBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f632a + 7;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ListStreamingActivity$bindingInflater$1 listStreamingActivity$bindingInflater$1 = ListStreamingActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 119;
        f632a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return listStreamingActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        LinearLayout linearLayout = ((ActivityListStreamingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).llRctiPlus;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: newOutputConfiguration
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        LinearLayout linearLayout2 = ((ActivityListStreamingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).llVisionPlus;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onCameraAccessPrioritiesChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = f632a + 77;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = f632a + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentbindingInflater1(((ActivityListStreamingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityListStreamingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_streaming));
        int i4 = f632a + 71;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        f632a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 7;
                f632a = i4 % 128;
                int i5 = i4 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c3  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 71;
        while (true) {
            $10 = i4 % 128;
            int i5 = i4 % 2;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 2;
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 2187, 40 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 841711447, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 33017), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3011, (ViewConfiguration.getTapTimeout() >> 16) + 26, 321985076, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - TextUtils.getOffsetBefore("", 0)), 3376 - Gravity.getAbsoluteGravity(0, 0), 'A' - AndroidCharacter.getMirror('0'), -968507904, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = $11 + 47;
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
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 1;
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (ViewConfiguration.getLongPressTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 3376, AndroidCharacter.getMirror('0') - 31, -968507904, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $11 + 59;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 3;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0345  */
    /* JADX WARN: Code duplicated, block: B:28:0x034f  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, (short) (b3 | 141), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, absoluteGravity, iKeyCodeFromString, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(ViewConfiguration.getKeyRepeatTimeout() >> 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).length() + 21, (char) (View.getDefaultSize(0, 0) + 33636), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getTapTimeout() >> 16) + 22, View.resolveSizeAndState(0, 0, 0) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
            int iArgb = 921 - Color.argb(0, 0, 0, 0);
            int i2 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr5 = new Object[1];
            c($$a[5], (byte) 52, (short) 141, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, iArgb, i2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = f632a + 13;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                byte b4 = $$a[5];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 36), (short) 89, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, tapTimeout, packedPositionChild, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i6 = ~i5;
            int i7 = (-162404097) + (((~(1259587285 | i6)) | 514492358) * (-328)) + ((i5 | 514492358) * 164) + (((~(i5 | (-1259587286))) | 167937732 | (~(i6 | 1606141911))) * 164) + 1265285428;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_app_name).substring(0, 12).length() + 25, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_dompetku).substring(0, 16).codePointAt(9) - 85, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step2).substring(2, 3).length() - 1), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 43, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 18, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 3251), objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i10 = TuitionPaymentFragmentbindingInflater1 + 75;
                f632a = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 72 / 0;
                    if (baseContext instanceof ContextWrapper) {
                        if (((ContextWrapper) baseContext).getBaseContext() != null) {
                            int i12 = f632a + 59;
                            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                            int i13 = i12 % 2;
                            baseContext = null;
                        }
                    }
                } else if (baseContext instanceof ContextWrapper) {
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        int i14 = f632a + 59;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        int i15 = i14 % 2;
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 86, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 96, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i16 = TuitionPaymentFragmentbindingInflater1 + 121;
            f632a = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(iIntValue), 0, 1265285428};
                byte[] bArr = $$j;
                byte b5 = bArr[62];
                Object[] objArr13 = new Object[1];
                f((byte) (-b5), b5, bArr[9], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr[9];
                Object[] objArr14 = new Object[1];
                f(b6, (byte) (b6 | 24), (byte) (-bArr[62]), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mirror2 = (char) (AndroidCharacter.getMirror('0') + 31485);
                    int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                    byte b7 = $$a[5];
                    Object[] objArr15 = new Object[1];
                    c(b7, (byte) (b7 | 36), (short) 89, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror2, threadPriority, minimumFlingVelocity, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(View.MeasureSpec.getSize(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_email_optional).substring(2, 3).codePointAt(0) - 75, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 33525), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_error_internal_server).substring(28, 29).length() + 14, (char) TextUtils.indexOf("", ""), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                        int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                        Object[] objArr18 = new Object[1];
                        c($$a[5], (byte) 52, (short) 141, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, maximumDrawingCacheSize, packedPositionGroup, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int scrollBarSize2 = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i18 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr19 = new Object[1];
                        c(b8, b9, (short) (b9 | 141), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, scrollBarSize2, i18, -1048449946, false, (String) objArr19[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i22 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i23 = i21 + (-1065019375) + (((-269289563) | i22) * 494) + (((~(i22 | 753984929)) | (-272469340)) * 494);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr20[0])[0] = i25 ^ (i25 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        int[] iArr = new int[i20];
        int i26 = i20 - 1;
        iArr[i26] = 1;
        Toast.makeText((Context) null, iArr[((i20 * i26) % 2) - 1], 1).show();
        int i27 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i28 = ~iElapsedRealtime;
        int i29 = i27 + 173461603 + (((~(1256165733 | i28)) | 335555602) * 184) + ((iElapsedRealtime | 1073807425) * (-184)) + ((~((-517913911) | i28)) * 184);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr21[0])[0] = i31 ^ (i31 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
            int iRed = Color.red(0) + 1755;
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
            byte b2 = $$a[5];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 36), (short) 89, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iRed, iResolveSizeAndState, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                int i4 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr3 = new Object[1];
                c($$a[5], (byte) 52, (short) 141, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i3, i4, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_alto).substring(0, 4).codePointAt(2) - 1746792623;
            int i6 = ~((-239079489) | iCodePointAt);
            int i7 = ~iCodePointAt;
            int i8 = ((((-2108100255) + ((i6 | (~(536108870 | i7))) * 920)) + ((239079488 | (~((-509631809) | i7))) * 920)) + (((~(iCodePointAt | 536108870)) | ((~((-239079489) | i7)) | (~((-270552321) | iCodePointAt)))) * 920)) - 545003153;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 34, 16 - View.combineMeasuredStates(0, 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_instalments).substring(4, 5).length() - 1), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 61, TextUtils.getOffsetAfter("", 0) + 16, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {2027862777};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 42049), 1725 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -545003153);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMakeMeasureSpec2 = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int iRed2 = 23 - Color.red(0);
                    Object[] objArr8 = new Object[1];
                    c($$a[5], (byte) 52, (short) 141, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec2, iLastIndexOf, iRed2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(Drawable.resolveOpacity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 33600), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 77, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step5).substring(1, 7).codePointAt(0) - 96, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                        int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                        byte b3 = (byte) 52;
                        Object[] objArr11 = new Object[1];
                        c($$a[5], b3, b3, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iCombineMeasuredStates, iMakeMeasureSpec, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                        int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                        byte b4 = $$a[5];
                        Object[] objArr12 = new Object[1];
                        c(b4, (byte) (b4 | 36), (short) 89, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iIndexOf, i11, 986134021, false, (String) objArr12[0], null);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i14 = TuitionPaymentFragmentbindingInflater1 + 125;
                    f632a = i14 % 128;
                    if (i14 % 2 == 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 59;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i16}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int i17 = (int) Runtime.getRuntime().totalMemory();
        int i18 = i15 + (-1144866607) + (((~(425110297 | i17)) | 637538370) * 336) + (((~(i17 | 637712723)) | 424935944) * (-168)) + (((~((~i17) | 637712723)) | 425110297) * 168);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        int i21 = f632a + 35;
        TuitionPaymentFragmentbindingInflater1 = i21 % 128;
        int i22 = i21 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int windowTouchSlop = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            Object[] objArr14 = new Object[1];
            c(bArr[5], (byte) 52, bArr[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveOpacity, windowTouchSlop, maximumDrawingCacheSize, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step3).substring(0, 1).codePointAt(0) - 80, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step3).substring(0, 3).length() + 19, (char) (View.resolveSizeAndState(0, 0, 0) + 33636), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 87, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, (char) View.resolveSizeAndState(0, 0, 0), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
            int i23 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr17 = new Object[1];
            c($$a[5], (byte) 52, (short) 141, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, trimmedLength, i23, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr18 = new Object[1];
                c(b5, b6, (short) (b6 | 141), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(bitsPerPixel, pressedStateDuration2, capsMode, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr19[3])[0];
            int i25 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i26 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i27 = (((1972551637 + ((~((~i26) | 198044121)) * (-116))) + ((46770640 | i26) * 116)) + (((~(i26 | (-197509530))) | 46236048) * 116)) - 833852677;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 70, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 9, 16 - ExpandableListView.getPackedPositionType(0L), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {2027862777};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - Color.green(0)), 1134 - KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionGroup(0L) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -833852677, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                byte[] bArr2 = $$a;
                Object[] objArr24 = new Object[1];
                c(bArr2[5], (byte) 52, bArr2[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, edgeSlop, iLastIndexOf2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45993), View.getDefaultSize(0, 0) + 1117, (-16777199) - Color.rgb(0, 0, 0)), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int iRed3 = 1031 - Color.red(0);
                int i30 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b7 = $$a[7];
                byte b8 = b7;
                Object[] objArr26 = new Object[1];
                c(b7, b8, (short) (b8 | 141), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(pressedStateDuration3, iRed3, i30, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_2).substring(5, 15).length() + 12, (char) (33635 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(TextUtils.indexOf("", "", 0) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_card_number).substring(11, 12).length() - 1), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int windowTouchSlop2 = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    Object[] objArr29 = new Object[1];
                    c($$a[5], (byte) 52, (short) 141, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSizeAndState, doubleTapTimeout, windowTouchSlop2, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                    int pressedStateDuration4 = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr30 = new Object[1];
                    c(bArr3[5], (byte) 52, bArr3[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iNormalizeMetaState, pressedStateDuration4, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 != i31) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i33 = f632a + 71;
                TuitionPaymentFragmentbindingInflater1 = i33 % 128;
                int i34 = i33 % 2;
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i32));
        }
        int i35 = TuitionPaymentFragmentbindingInflater1 + 87;
        f632a = i35 % 128;
        int i36 = i35 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_5).substring(17, 19).codePointAt(1) - 1467288203;
        int i40 = i37 + (((~((-806225993) | iCodePointAt2)) | (-1056931807)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1293841900 + ((~((~iCodePointAt2) | (-806225993))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
        int i41 = i40 ^ (i40 << 13);
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr31[2])[0] = i42 ^ (i42 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
        f632a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != 1787614692 + (((~(1050464109 | iIdentityHashCode)) | 220476566) * (-366)) + (((~(iIdentityHashCode | 1069350911)) | 201589764) * 366)) {
                throw null;
            }
        } else {
            int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = ~elapsedCpuTime;
            if (i4 != 436818192 + (((~((-1008649050) | i5)) | (-1838636593)) * 519) + (((~(i5 | (-739656209))) | (~((-1098980385) | elapsedCpuTime))) * (-519)) + (((~(elapsedCpuTime | (-1838636593))) | 1008649049) * 519)) {
                throw null;
            }
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ~(((int) Process.getStartUptimeMillis()) | 1926693627);
        if (i6 != ((1343553690 | i7) * (-196)) + 1296296192 + ((i7 | 583139937) * 196)) {
            throw new RuntimeException("-426068293");
        }
        super.onResume();
        int i8 = f632a + 5;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b6, code lost:
    
        if (r1 != (((2040475476 + (((-71321697) | (~r2)) * (-490))) + (((~(r2 | 1790904087)) | (-1862225784)) * 490)) + 1908254734)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b8, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.streaming.ListStreamingActivity.f632a + 17;
        com.bpjstku.presentation.streaming.ListStreamingActivity.TuitionPaymentFragmentbindingInflater1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c5, code lost:
    
        r1 = (-407133416) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ce, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cf, code lost:
    
        r1 = 216393554 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0058, code lost:
    
        if (r1 == (((((-1938418668) | r4) * (-658)) - 1671909816) + ((r4 | (-2008939516)) * 658))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008b, code lost:
    
        if (r1 == ((449271984 + ((r5 | (~(r6 | 972795903))) * 497)) + (((~(r4 | 972795903)) | ((~((-140610553) | r6)) | 138412744)) * 497))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.ListStreamingActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        if (i2 != (((~(1072471039 | i3)) | 140771368) * 449) + 2109502680 + (((~((~i3) | 1072471039)) | 140771368) * 449)) {
            throw new RuntimeException("568197921");
        }
        int i4 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        if (i4 != (((~(i5 | 2006561847)) * TypedValues.CycleType.TYPE_EASING) - 537627512) + (((~((~i5) | 2006561847)) | 572100645) * TypedValues.CycleType.TYPE_EASING)) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 41;
            f632a = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[1242043308];
            iArr[1242043307] = 1;
            int i8 = 1648027620 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i9 = f632a + 121;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ListStreamingActivity listStreamingActivity, View view) {
        int i = 2 % 2;
        int i2 = f632a + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        listStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "https://bpjsjmowv.visionplus.id";
        NewWebviewCustomActivity.Companion companion = NewWebviewCustomActivity.INSTANCE;
        NewWebviewCustomActivity.Companion.b(listStreamingActivity, listStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "Vision+", "VISION");
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
        f632a = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListStreamingActivity listStreamingActivity, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = f632a + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            listStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "https://m.rctiplus.com?utm_source=bpjs&utm_medium=bpjs&utm_campaign=bpjs&utm_id=bpsjs";
            NewWebviewCustomActivity.Companion companion = NewWebviewCustomActivity.INSTANCE;
            NewWebviewCustomActivity.Companion.b(listStreamingActivity, listStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "RCTI+", "RCTI+");
            unit = Unit.INSTANCE;
            int i4 = 67 / 0;
        } else {
            listStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "https://m.rctiplus.com?utm_source=bpjs&utm_medium=bpjs&utm_campaign=bpjs&utm_id=bpsjs";
            NewWebviewCustomActivity.Companion companion2 = NewWebviewCustomActivity.INSTANCE;
            NewWebviewCustomActivity.Companion.b(listStreamingActivity, listStreamingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "RCTI+", "RCTI+");
            unit = Unit.INSTANCE;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 13;
        f632a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return unit;
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 99;
        d = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentbindingInflater1 = ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1807746144, -1807746144, iTuitionPaymentFragmentbindingInflater2, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        f632a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1169330874, new Object[]{this}, -1403184747, 1403184748, ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_card_number).substring(11, 12).length() + 1232451256, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        f632a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{12953, 63974, 42108, 20698, 8023, 52129, 63036, 41670, 26903, 5243, 49334, 36731, 48065, 26171, 4780, 55565, 34197, 45259, 32628, 11207, 54875, 33443, 45561, 31360, 10013, 54204, 39983, 18633, 30040, 8670, 60025, 38669, 17296, 3128, 14517, 58689, 37337, 45565, 31362, 10008, 54206, 39987, 18629, 30040, 8610, 60029, 38684, 17292, 3170, 14493, 58703, 37320, 23141, 1770, 13189, 64520, 43189, 21768, 452, 51790, 63209, 41853, 27656, 48424, 30286, 11225, 57193, 37102, 17429, 31135, 11546, 59067, 39883, 20295, 242, 13416, 59802, 40223, 22194, 2596, 16213, 45558, 31373, 9994, 54189, 40050, 18624, 30045, 8674, 60027, 38722, 17327, 3125, 14511, 58712, 37337, 23137, 45557, 31368, 10009, 54178, 39976, 18629, 30024, 8693, 59988, 38669, 17295, 3108, 14495, 58691, 37336, 23145};
        b = -4251917561537660180L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f632a + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            int i4 = 88 / 0;
        }
        int i5 = i3 + 43;
        f632a = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(R.layout.activity_list_streaming);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f632a + 37;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r0 = com.bpjstku.presentation.streaming.ListStreamingActivity.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
        L27:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.streaming.ListStreamingActivity.$$i(byte, int, int):java.lang.String");
    }
}
