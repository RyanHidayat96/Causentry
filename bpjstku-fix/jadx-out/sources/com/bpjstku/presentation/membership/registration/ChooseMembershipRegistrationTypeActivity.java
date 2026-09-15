package com.bpjstku.presentation.membership.registration;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.databinding.ActivityChooseMembershipRegistrationTypeBinding;
import com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5;
import defpackage.UseFlashModeTorchFor3aUpdate;
import defpackage.ViewPortBuilder;
import defpackage.getMaxImages;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMap$values$1$iterator$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/ChooseMembershipRegistrationTypeActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityChooseMembershipRegistrationTypeBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChooseMembershipRegistrationTypeActivity extends BindingBaseActivity<ActivityChooseMembershipRegistrationTypeBinding> {
    private static final byte[] $$c = {91, -9, 99, 11};
    private static final int $$f = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 77;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f542a = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 27445;
    private static char b = 27593;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 22703;
    private static char TuitionPaymentFragmentbindingInflater1 = 20510;

    public static /* synthetic */ Object b(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i4 + i + i2 + ((-112346298) * i5) + (505796074 * i3);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i4) - 1525940224) + (1734765094 * i) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i2) + (859308032 * i5) + (310902784 * i3) + (417529856 * i13);
        int i15 = (i4 * (-1233303660)) + 1670658458 + (i * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i2 * (-1233302909)) + (i5 * 1075253458) + (i3 * 745806526) + (i13 * 1512636416);
        int i16 = i14 + (i15 * i15 * (-1737162752));
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
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
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.c(int, short, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f542a + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ChooseMembershipRegistrationTypeActivity$bindingInflater$1 chooseMembershipRegistrationTypeActivity$bindingInflater$1 = ChooseMembershipRegistrationTypeActivity$bindingInflater$1.b;
        int i4 = f542a + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return chooseMembershipRegistrationTypeActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ImageView imageView = ((ActivityChooseMembershipRegistrationTypeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Function1 function1 = new Function1() { // from class: SearchView3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        imageView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        ImageView imageView3 = ((ActivityChooseMembershipRegistrationTypeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgNonSalariedWorker;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        ImageView imageView4 = imageView3;
        Function1 function2 = new Function1() { // from class: SearchView5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        imageView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
        ImageView imageView5 = ((ActivityChooseMembershipRegistrationTypeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgIndonesianMigrantWorker;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        ImageView imageView6 = imageView5;
        Function1 function3 = new Function1() { // from class: SearchViewApi29Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(imageView6, "");
        Intrinsics.checkNotNullParameter(function3, "");
        imageView6.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function3));
        int i2 = f542a + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i;
        int i2 = 2 % 2;
        int i3 = f542a + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            Group group = ((ActivityChooseMembershipRegistrationTypeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker;
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            Intrinsics.areEqual(getMaxImages.MediaBrowserCompatMediaBrowserImplApi21(), "");
            throw null;
        }
        Group group2 = ((ActivityChooseMembershipRegistrationTypeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).groupSalariedWorker;
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        if (Intrinsics.areEqual(getMaxImages.MediaBrowserCompatMediaBrowserImplApi21(), "")) {
            i = 8;
        } else {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            f542a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
            i = 0;
        }
        group2.setVisibility(i);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity = (ChooseMembershipRegistrationTypeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f542a + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity2 = chooseMembershipRegistrationTypeActivity;
        Intrinsics.checkNotNullParameter(chooseMembershipRegistrationTypeActivity2, "");
        chooseMembershipRegistrationTypeActivity2.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityChooseMembershipRegistrationTypeBinding) ((ViewBinding) chooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = chooseMembershipRegistrationTypeActivity.getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        chooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i4 = f542a + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        f542a = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                f542a = i3 % 128;
                int i4 = i3 % 2;
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = f542a + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
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
            int i4 = $10 + 125;
            $11 = i4 % 128;
            char c = 1;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 47774);
                        int maximumDrawingCacheSize = 468 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int threadPriority = 13 - ((Process.getThreadPriority(i3) + 20) >> 6);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, maximumDrawingCacheSize, threadPriority, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 47773), TextUtils.getOffsetBefore("", 0) + 468, 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    c = 1;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2323, 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:17:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:19:0x0178  */
    /* JADX WARN: Code duplicated, block: B:22:0x01fe A[Catch: all -> 0x0a11, TryCatch #0 {all -> 0x0a11, blocks: (B:20:0x01ea, B:22:0x01fe, B:23:0x0231, B:51:0x06aa, B:53:0x06be, B:54:0x06ec, B:56:0x071e, B:57:0x078f), top: B:97:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:26:0x024b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0314  */
    /* JADX WARN: Code duplicated, block: B:34:0x0362  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = f542a + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                int packedPositionType = 23 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr = $$a;
                short s = bArr[5];
                byte b2 = bArr[28];
                Object[] objArr2 = new Object[1];
                c(s, b2, (byte) (b2 | 36), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, packedPositionChild, packedPositionType, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i3 = 75 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr2 = $$a;
                    Object[] objArr3 = new Object[1];
                    c((short) (bArr2[12] + 1), bArr2[28], (byte) 52, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iCombineMeasuredStates, iLastIndexOf, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = (((((~((-735757113) | iIdentityHashCode)) | 185237560) * (-566)) + 1977846281) + ((~(iIdentityHashCode | (-550519553))) * 566)) - 1145076857;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{878, 28376, 14048, 43453, 23877, 47551, 41703, 36889, 24016, 45020, 36755, 40002, 12004, 30419, 5139, 22629, 19046, 26321}, 16 - View.MeasureSpec.getSize(0), objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{21692, 2437, 44500, 11334, 941, 43892, 20694, 25511, 28170, 52686, 37056, 20956, 48417, 47535, 4356, 33196, 31983, 63659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_mandiri_details).substring(87, 89).codePointAt(0) - 84, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {1179609395};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1726 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), -1145076857, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int i7 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 23;
                        byte[] bArr3 = $$a;
                        Object[] objArr8 = new Object[1];
                        c((short) (bArr3[12] + 1), bArr3[28], (byte) 52, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, i7, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{16775, 46512, 6794, 53387, 11834, 18345, 21677, 1570, 8201, 49067, 28003, 34015, 58678, 47281, 31896, 28808, 47460, 29707, 29549, 51323, 34838, 29748, 38746, 37813}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{58044, 51583, 6627, 36863, 31674, 9482, 39189, 15690, 41879, 3697, 12098, 36377, 62742, 23913, 13853, 14383, 49304, 52886}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                            int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 23;
                            byte[] bArr4 = $$a;
                            Object[] objArr11 = new Object[1];
                            c(bArr4[3], bArr4[28], (byte) 52, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, capsMode, iCombineMeasuredStates2, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                            int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr5 = $$a;
                            short s2 = bArr5[5];
                            byte b3 = bArr5[28];
                            Object[] objArr12 = new Object[1];
                            c(s2, b3, (byte) (b3 | 36), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, pressedStateDuration2, iResolveSizeAndState, 986134021, false, (String) objArr12[0], null);
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
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0', 0);
                byte[] bArr6 = $$a;
                short s3 = bArr6[5];
                byte b4 = bArr6[28];
                Object[] objArr13 = new Object[1];
                c(s3, b4, (byte) (b4 | 36), objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, iIndexOf2, iLastIndexOf2, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char deadChar2 = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                    int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 1755;
                    int iLastIndexOf3 = 22 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr7 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) (bArr7[12] + 1), bArr7[28], (byte) 52, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar2, iCombineMeasuredStates3, iLastIndexOf3, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i8 = (((((~((-735757113) | iIdentityHashCode2)) | 185237560) * (-566)) + 1977846281) + ((~(iIdentityHashCode2 | (-550519553))) * 566)) - 1145076857;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{878, 28376, 14048, 43453, 23877, 47551, 41703, 36889, 24016, 45020, 36755, 40002, 12004, 30419, 5139, 22629, 19046, 26321}, 16 - View.MeasureSpec.getSize(0), objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{21692, 2437, 44500, 11334, 941, 43892, 20694, 25511, 28170, 52686, 37056, 20956, 48417, 47535, 4356, 33196, 31983, 63659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_mandiri_details).substring(87, 89).codePointAt(0) - 84, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {1179609395};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1726 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), -1145076857, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char pressedStateDuration3 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int i11 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iIndexOf3 = TextUtils.indexOf("", "", 0) + 23;
                    byte[] bArr8 = $$a;
                    Object[] objArr19 = new Object[1];
                    c((short) (bArr8[12] + 1), bArr8[28], (byte) 52, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration3, i11, iIndexOf3, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                Object[] objArr20 = new Object[1];
                e(new char[]{16775, 46512, 6794, 53387, 11834, 18345, 21677, 1570, 8201, 49067, 28003, 34015, 58678, 47281, 31896, 28808, 47460, 29707, 29549, 51323, 34838, 29748, 38746, 37813}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{58044, 51583, 6627, 36863, 31674, 9482, 39189, 15690, 41879, 3697, 12098, 36377, 62742, 23913, 13853, 14383, 49304, 52886}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 29944);
                    int capsMode2 = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 23;
                    byte[] bArr9 = $$a;
                    Object[] objArr111 = new Object[1];
                    c(bArr9[3], bArr9[28], (byte) 52, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, capsMode2, iCombineMeasuredStates4, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 29944);
                    int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                    int iResolveSizeAndState2 = 23 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr10 = $$a;
                    short s4 = bArr10[5];
                    byte b5 = bArr10[28];
                    Object[] objArr112 = new Object[1];
                    c(s4, b5, (byte) (b5 | 36), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength2, pressedStateDuration4, iResolveSizeAndState2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i12 = f542a + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i15 = ~(820562728 | layoutDirection);
        int i16 = ~layoutDirection;
        int i17 = i15 | (~(1033165154 | i16));
        int i18 = ~((-820562729) | i16);
        int i19 = i14 + 1466721805 + ((i17 | i18) * (-516)) + (((~(layoutDirection | (-219418691))) | (~((-813746465) | i16))) * 516) + ((813746464 | i18) * 516);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[3])[0] = i21 ^ (i21 << 5);
        int i22 = f542a;
        int i23 = i22 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
        int i24 = i23 % 2;
        int i25 = i22 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
        int i26 = i25 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int windowTouchSlop = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i27 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr22 = new Object[1];
            c((short) 140, $$a[28], (byte) 52, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(longPressTimeout, windowTouchSlop, i27, 1357589585, false, (String) objArr22[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        e(new char[]{16775, 46512, 6794, 53387, 11834, 18345, 21677, 1570, 8201, 49067, 28003, 34015, 58678, 47281, 31896, 28808, 47460, 29707, 29549, 51323, 34838, 29748, 38746, 37813}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_credit_card).substring(10, 12).length() + 20, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        e(new char[]{58044, 51583, 6627, 36863, 31674, 9482, 39189, 15690, 41879, 3697, 12098, 36377, 62742, 23913, 13853, 14383, 49304, 52886}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
            int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr11 = $$a;
            Object[] objArr25 = new Object[1];
            c((short) (bArr11[12] + 1), bArr11[28], (byte) 52, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mode, tapTimeout, maximumFlingVelocity, 1344079056, false, (String) objArr25[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            f542a = i28 % 128;
            int i29 = i28 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                int i30 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                short s5 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b6 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(s5, b6, b6, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(deadChar3, scrollBarSize, i30, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr27[3])[0];
            int i32 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i33 = ((619471748 + (((~((~iIdentityHashCode3) | 955068803)) | 34653720) * 529)) + (((~(iIdentityHashCode3 | 955068803)) | 710788633) * 529)) - 949520402;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            e(new char[]{878, 28376, 14048, 43453, 23877, 47551, 41703, 36889, 24016, 45020, 36755, 40002, 12004, 30419, 5139, 22629, 19046, 26321}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            e(new char[]{21692, 2437, 44500, 11334, 941, 43892, 20694, 25511, 28170, 52686, 37056, 20956, 48417, 47535, 4356, 33196, 31983, 63659}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step3).substring(1, 7).length() + 10, objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {1179609395};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 46038), Color.alpha(0) + 1134, View.MeasureSpec.getMode(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, -949520402, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf3 = (char) TextUtils.indexOf("", "");
                int i36 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                int iRed = Color.red(0) + 15;
                Object[] objArr32 = new Object[1];
                c((short) 140, $$a[28], (byte) 52, objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf3, i36, iRed, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ((byte) KeyEvent.getModifierMetaStateMask())), 1117 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.keyCodeFromString("") + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int i37 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int defaultSize = 15 - View.getDefaultSize(0, 0);
                short s6 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b7 = $$a[7];
                Object[] objArr33 = new Object[1];
                c(s6, b7, b7, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, i37, defaultSize, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                e(new char[]{16775, 46512, 6794, 53387, 11834, 18345, 21677, 1570, 8201, 49067, 28003, 34015, 58678, 47281, 31896, 28808, 47460, 29707, 29549, 51323, 34838, 29748, 38746, 37813}, KeyEvent.getDeadChar(0, 0) + 22, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                e(new char[]{58044, 51583, 6627, 36863, 31674, 9482, 39189, 15690, 41879, 3697, 12098, 36377, 62742, 23913, 13853, 14383, 49304, 52886}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iIndexOf4 = 15 - TextUtils.indexOf("", "", 0);
                    byte[] bArr12 = $$a;
                    Object[] objArr36 = new Object[1];
                    c((short) (bArr12[12] + 1), bArr12[28], (byte) 52, objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout2, fadingEdgeLength, iIndexOf4, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int windowTouchSlop2 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int deadChar4 = KeyEvent.getDeadChar(0, 0) + 15;
                    Object[] objArr37 = new Object[1];
                    c((short) 140, $$a[28], (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c2, windowTouchSlop2, deadChar4, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArr[1])[0];
        int i39 = ((int[]) objArr[3])[0];
        if (i39 == i38) {
            Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i40 = ((int[]) objArr[2])[0];
            int i41 = ((int[]) objArr[3])[0];
            int i42 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iMyTid = Process.myTid();
            int i43 = ~iMyTid;
            int i44 = (~((-1034518447) | i43)) | 755504132;
            int i45 = ~(iMyTid | 1069252590);
            int i46 = i40 + (-79267020) + ((i44 | i45) * (-713)) + (i45 * 1426) + ((~(790238276 | i43)) * 713);
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArr38[2])[0] = i48 ^ (i48 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i39 / (((i39 - 1) * i39) % 2), 0).show();
        Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i49 = ((int[]) objArr[2])[0];
        int i50 = ((int[]) objArr[3])[0];
        int i51 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i52 = ~iIdentityHashCode4;
        int i53 = i49 + (-1589575152) + (((~(271465438 | i52)) | 515745608) * 226) + (((~(i52 | 515882974)) | (~((-515745609) | iIdentityHashCode4)) | 271328072) * (-113)) + ((~(iIdentityHashCode4 | 271465438)) * 113);
        int i54 = i53 ^ (i53 << 13);
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr39[2])[0] = i55 ^ (i55 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -347258610
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
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ab, code lost:
    
        if (r0 != (((212821388 + (((~(1913337763 | r4)) | 94636056) * 184)) + ((r2 | 1342255618) * (-184))) + ((~((-665718202) | r4)) * 184))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ad, code lost:
    
        super.onStart();
        r9 = com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.f542a + 89;
        com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b9, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bc, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        throw new java.lang.RuntimeException("453344863");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cf, code lost:
    
        throw new java.lang.RuntimeException("-2145958510");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        if (r2 == (((-1806733070) + (((~((~r4) | 87503087)) | 847825664) * 529)) + (((~(r4 | 87503087)) | 917490630) * 529))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0077, code lost:
    
        if (r2 == (((-650132078) + ((r5 | (~(r6 | 999276411))) * 497)) + (((~(r4 | 999276411)) | ((~((-152019571) | r6)) | 134750272)) * 497))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0079, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r4 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[] r9) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00da, code lost:
    
        if (r1 != (((((~((-643570075) | r2)) | 67112984) * (-566)) + 1910299244) + ((~(r2 | (-576457091))) * 566))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00dc, code lost:
    
        super.onCreate(r9);
        r9 = com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.f542a + 11;
        com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e8, code lost:
    
        if ((r9 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ea, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00eb, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ee, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ef, code lost:
    
        r9 = (-676426250) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0100, code lost:
    
        throw new java.lang.RuntimeException("-2097660982");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0065, code lost:
    
        if (r1 == ((((-366906264) + (((~((-546309419) | (~r2))) | (~((-1376296962) | r2))) * (-272))) + (((~((-754341231) | r2)) | 208031812) * (-272))) + (((~(r2 | 754341230)) | (-1584328774)) * 272))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ae, code lost:
    
        if (r1 == ((1112330240 + ((r3 | r6) * (-470))) + (((~(r2 | 2080370175)) | r6) * 470))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b0, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = new java.util.Random().nextInt();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        f542a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity2 = chooseMembershipRegistrationTypeActivity;
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseMembershipRegistrationTypeActivity2, getMaxImages.MediaBrowserCompatMediaBrowserImplApi21(), "Pendaftaran PU", 0, null, false, 32);
            return Unit.INSTANCE;
        }
        WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
        ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity3 = chooseMembershipRegistrationTypeActivity;
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseMembershipRegistrationTypeActivity3, getMaxImages.MediaBrowserCompatMediaBrowserImplApi21(), "Pendaftaran PU", 0, null, false, 56);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = f542a + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity2 = chooseMembershipRegistrationTypeActivity;
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseMembershipRegistrationTypeActivity2, getMaxImages.MediaBrowserCompatMediaBrowserImplApi211(), "Pendaftaran PMI", 0, null, false, 12);
            unit = Unit.INSTANCE;
        } else {
            WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
            ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity3 = chooseMembershipRegistrationTypeActivity;
            getMaxImages getmaximages2 = getMaxImages.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(chooseMembershipRegistrationTypeActivity3, getMaxImages.MediaBrowserCompatMediaBrowserImplApi211(), "Pendaftaran PMI", 0, null, false, 56);
            unit = Unit.INSTANCE;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        f542a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ChooseMembershipRegistrationTypeActivity chooseMembershipRegistrationTypeActivity, View view) {
        int i = 2 % 2;
        int i2 = f542a + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
        TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(chooseMembershipRegistrationTypeActivity, false, false, 6);
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        f542a = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityChooseMembershipRegistrationTypeBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) b(-1702557562, new Object[]{this}, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(), 1702557564, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellTargetedBrandTitle).substring(0, 14).length() - 444497260, (-98505736) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_expiry_date).substring(16, 17).codePointAt(0));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 55;
        f542a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        f542a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return R.layout.activity_choose_membership_registration_type;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        f542a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        f542a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentbindingInflater1 = DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
        b(793081801, new Object[]{this}, DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(), DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(), -793081800, DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int iTuitionPaymentFragmentbindingInflater1 = DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
        b(1785131266, new Object[]{this}, DelegatingScheduledExecutorService$$ExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -1785131266, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f542a + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        f542a = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 108 - r6
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.ChooseMembershipRegistrationTypeActivity.$$i(byte, int, int):java.lang.String");
    }
}
