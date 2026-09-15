package com.bpjstku.presentation.onboarding;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityOnboardingBinding;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.onboarding.OnBoardingActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import defpackage.OutputOptionsOutputOptionsInternalBuilder;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.enabledefault;
import defpackage.ensureLogoView;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getRequiredMaxBitDepth;
import defpackage.initSession;
import defpackage.onExtraCallback;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000f\u001a\u00020\u00118\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/presentation/onboarding/OnBoardingActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityOnboardingBinding;", "<init>", "()V", "", "c_", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LonExtraCallback;", "LonExtraCallback;", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnBoardingActivity extends BindingBaseActivity<ActivityOnboardingBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char asBinder;
    private static int asInterface;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private int b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private onExtraCallback TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_onboarding;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {111, 40, 23, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 231;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f573a = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i4);
        int i11 = i9 | i10 | (~(i8 | i4));
        int i12 = i10 | i2;
        int i13 = ~i4;
        int i14 = (~(i2 | i13 | i3)) | (~(i7 | i13 | i8)) | (~(i8 | i3 | i4));
        int i15 = i3 + i4 + i + ((-1329026341) * i6) + ((-1277752516) * i5);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i3) - 1912602624) + ((-659060787) * i4) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i) + (494927872 * i6) + (1577058304 * i5) + ((-1783103488) * i16);
        int i18 = (i3 * 595972471) + 129777640 + (i4 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i * 595972219) + (i6 * (-1341978823)) + (i5 * 731850196) + (i16 * 1869086720);
        int i19 = i17 + (i18 * i18 * (-846725120));
        if (i19 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i19 != 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        final OnBoardingActivity onBoardingActivity = (OnBoardingActivity) objArr[0];
        int i20 = 2 % 2;
        ((ActivityOnboardingBinding) ((ViewBinding) onBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpOnboarding.addOnPageChangeListener(onBoardingActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        ((ActivityOnboardingBinding) ((ViewBinding) onBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNext.setOnClickListener(new View.OnClickListener() { // from class: load
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                OnBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1118639145, 1118639145, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr2, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        ((ActivityOnboardingBinding) ((ViewBinding) onBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvSkip.setOnClickListener(new View.OnClickListener() { // from class: TokenStore
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, view);
            }
        });
        int i21 = d + 55;
        f573a = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r0 = com.bpjstku.presentation.onboarding.OnBoardingActivity.$$a
            int r8 = r8 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.onboarding.OnBoardingActivity.c(int, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ ActivityOnboardingBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1(OnBoardingActivity onBoardingActivity) {
        int i = 2 % 2;
        int i2 = d + 123;
        f573a = i2 % 128;
        int i3 = i2 % 2;
        ActivityOnboardingBinding activityOnboardingBinding = (ActivityOnboardingBinding) ((ViewBinding) onBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = f573a + 121;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return activityOnboardingBinding;
        }
        throw null;
    }

    public static final /* synthetic */ onExtraCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3(OnBoardingActivity onBoardingActivity) {
        int i = 2 % 2;
        int i2 = f573a + 55;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = onBoardingActivity.TuitionPaymentFragmentbindingInflater1;
        int i5 = i3 + 15;
        f573a = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.onboarding.OnBoardingActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/onboarding/OnBoardingActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) OnBoardingActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final void c_() {
        View childAt;
        int i = 2 % 2;
        int i2 = f573a + 87;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(1);
            if (childAt == null) {
                return;
            }
        } else {
            childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
            if (childAt == null) {
                return;
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(childAt, new OnApplyWindowInsetsListener() { // from class: store
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return OnBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, windowInsetsCompat);
            }
        });
        int i3 = f573a + 125;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityOnboardingBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 63;
        f573a = i2 % 128;
        if (i2 % 2 != 0) {
            OnBoardingActivity$bindingInflater$1 onBoardingActivity$bindingInflater$1 = OnBoardingActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        OnBoardingActivity$bindingInflater$1 onBoardingActivity$bindingInflater$2 = OnBoardingActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = d + 43;
        f573a = i3 % 128;
        int i4 = i3 % 2;
        return onBoardingActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i;
        int i2 = 2 % 2;
        int i3 = f573a;
        int i4 = i3 + 21;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5 = 28 / 0;
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i6 = i3 + 117;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        OnBoardingActivity onBoardingActivity = this;
        Intrinsics.checkNotNullParameter(onBoardingActivity, "");
        onBoardingActivity.getWindow().addFlags(8192);
        String string = getString(R.string.label_title_onboarding1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.label_desc_onboarding_1);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        enabledefault enabledefaultVar = new enabledefault(string, string2, 2131230934);
        String string3 = getString(R.string.label_title_onboarding2);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.label_desc_onboarding_2);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        enabledefault enabledefaultVar2 = new enabledefault(string3, string4, 2131230935);
        String string5 = getString(R.string.label_title_onboarding3);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(R.string.label_desc_onboarding_3);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        this.TuitionPaymentFragmentbindingInflater1 = new onExtraCallback(this, CollectionsKt.mutableListOf(enabledefaultVar, enabledefaultVar2, new enabledefault(string5, string6, 2131230936)));
        ViewPager viewPager = ((ActivityOnboardingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpOnboarding;
        onExtraCallback onextracallback = this.TuitionPaymentFragmentbindingInflater1;
        if (onextracallback == null) {
            int i2 = f573a + 19;
            d = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f573a + 35;
            d = i4 % 128;
            int i5 = i4 % 2;
            onextracallback = null;
        }
        viewPager.setAdapter(onextracallback);
        DotsIndicator dotsIndicator = ((ActivityOnboardingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).dotsIndicator;
        ViewPager viewPager2 = ((ActivityOnboardingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpOnboarding;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        Intrinsics.checkNotNullParameter(viewPager2, "");
        new OutputOptionsOutputOptionsInternalBuilder().TuitionPaymentFragmentspecialinlinedviewModeldefault2(dotsIndicator, viewPager2);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i2) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            ViewPortBuilder.asInterface();
            try {
                TextView textView = OnBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(OnBoardingActivity.this).tvSkip;
                onExtraCallback onextracallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = OnBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(OnBoardingActivity.this);
                if (onextracallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    onextracallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                textView.setVisibility(i < onextracallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.getCount() + (-1) ? 0 : 8);
            } finally {
                ViewPortBuilder.d();
            }
        }
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 31;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1236, Gravity.getAbsoluteGravity(0, 0) + 35, -653973969, false, $$i(b, b2, (byte) (b2 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 2764, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSize(0, 0) + 43325), 253 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 21 - TextUtils.indexOf((CharSequence) "", '0'), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf("", "", 0, 0) + 2891, Color.argb(0, 0, 0, 0) + 17, 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) asInterface) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 13;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        OnBoardingActivity onBoardingActivity = (OnBoardingActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = f573a + 83;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int i4 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
            byte[] bArr = $$a;
            short s = bArr[5];
            Object[] objArr3 = new Object[1];
            c(s, (byte) (s & 52), bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i4, pressedStateDuration, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{52999, 29689, 18952, 25036}, (char) (Color.rgb(0, 0, 0) + 16777216), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{15096, 2333, 23489, 52085, 14206, 6300, 59583, 37102, 31350, 64899, 541, 21822, 1274, 2373, 32629, 4194, 39710, 43892, 56940, 32391, 26721, 42976}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{17843, 44938, 9616, 55559}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_not_enabled_message).substring(5, 6).codePointAt(0) + 1797), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1867544031, new char[]{59190, 13825, 37083, 41163, 34172, 9059, 62368, 24795, 21432, 51967, 39095, 41807, 34550, 30647, 57684}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iIndexOf = 1031 - TextUtils.indexOf("", "");
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
            short s2 = (short) 51;
            Object[] objArr6 = new Object[1];
            c(s2, (byte) (s2 + 1), $$a[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration2, iIndexOf, iIndexOf2, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = f573a + 71;
            d = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iIndexOf3 = TextUtils.indexOf("", "") + 1031;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                short s3 = (short) ($$b & 383);
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                c(s3, bArr2[7], bArr2[132], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, iIndexOf3, absoluteGravity, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr8[3])[0];
            int i8 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iMyTid = Process.myTid();
            int i9 = ~iMyTid;
            int i10 = 1738225693 + (((~(iMyTid | (-559200138))) | (~((-803480308) | i9))) * 333) + (((~((-803480308) | iMyTid)) | (~(i9 | (-559200138)))) * 333) + 297654891;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr2[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{23542, 26709, 14256, 62336}, (char) (32822 - ((byte) KeyEvent.getModifierMetaStateMask())), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{20234, 32777, 58417, 40266, 14489, 33171, 54250, 16644, 6876, 45623, 23640, 40116, 21040, 500, 14390, 53162}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{20562, 45639, 17119, 6385}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 61726), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness_with_back).substring(0, 54).length() - 54, new char[]{38469, 24214, 44861, 48992, 6861, 58302, 26377, 48824, 31844, 51962, 63415, 49282, 57501, 20365, 43476, 34962}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, onBoardingActivity)).intValue();
            try {
                Object[] objArr11 = {-1558022759};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - Process.getGidForName("")), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1134, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 297654891, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr3 = $$a;
                    short s4 = bArr3[5];
                    Object[] objArr13 = new Object[1];
                    c(s4, (byte) (s4 & 52), bArr3[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, i13, i14, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.blue(0)), 1117 - TextUtils.getCapsMode("", 0, 0), Color.red(0) + 17), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i15 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 15;
                    short s5 = (short) ($$b & 383);
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(s5, bArr4[7], bArr4[132], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, i15, packedPositionType, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{52999, 29689, 18952, 25036}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_failed).substring(53, 55).length() - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_format_valid_until).substring(3, 4).codePointAt(0) - 97, new char[]{15096, 2333, 23489, 52085, 14206, 6300, 59583, 37102, 31350, 64899, 541, 21822, 1274, 2373, 32629, 4194, 39710, 43892, 56940, 32391, 26721, 42976}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{17843, 44938, 9616, 55559}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).codePointAt(0) + 1797), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1867544031, new char[]{59190, 13825, 37083, 41163, 34172, 9059, 62368, 24795, 21432, 51967, 39095, 41807, 34550, 30647, 57684}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int capsMode = 1031 - TextUtils.getCapsMode("", 0, 0);
                        int i16 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        short s6 = (short) 51;
                        Object[] objArr17 = new Object[1];
                        c(s6, (byte) (s6 + 1), $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, capsMode, i16, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iMyPid = 1031 - (Process.myPid() >> 22);
                        int fadingEdgeLength2 = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr5 = $$a;
                        short s7 = bArr5[5];
                        Object[] objArr18 = new Object[1];
                        c(s7, (byte) (s7 & 52), bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState, iMyPid, fadingEdgeLength2, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 != null) {
                int i17 = d + 91;
                f573a = i17 % 128;
                int i18 = i17 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr2[2])[0];
        int i20 = ((int[]) objArr2[3])[0];
        int i21 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int iNextInt = new Random().nextInt(1423342314);
        int i22 = ~iNextInt;
        int i23 = (~(199203313 | i22)) | 270533642;
        int i24 = ~(iNextInt | (-26253473));
        int i25 = i19 + (((i23 | i24) * (-252)) - 300718783) + ((i24 | (~(i22 | 469736955))) * 252);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr19[2])[0] = i27 ^ (i27 << 5);
        int i28 = f573a + 35;
        d = i28 % 128;
        int i29 = i28 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cGreen = (char) (29944 - Color.green(0));
            int i30 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 24;
            short s8 = (short) ($$b & 383);
            Object[] objArr20 = new Object[1];
            c(s8, (byte) (s8 & 189), $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cGreen, i30, iIndexOf4, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i31 = f573a + 119;
            d = i31 % 128;
            int i32 = i31 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char packedPositionType2 = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                int i33 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                short s9 = (short) 51;
                Object[] objArr21 = new Object[1];
                c(s9, (byte) (s9 + 1), $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionType2, i33, scrollBarSize, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i34 = ~((-103813699) | startElapsedRealtime);
            int i35 = ~startElapsedRealtime;
            int i36 = (-2108100255) + ((i34 | (~((-237585) | i35))) * 920) + (((~((-108551144) | i35)) | 103813698) * 920) + (((~(startElapsedRealtime | (-237585))) | (~((-103813699) | i35)) | (~((-4737446) | startElapsedRealtime))) * 920) + 785115777;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i38 ^ (i38 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{23542, 26709, 14256, 62336}, (char) (View.getDefaultSize(0, 0) + 32823), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_cvv).substring(18, 28).length() - 10, new char[]{20234, 32777, 58417, 40266, 14489, 33171, 54250, 16644, 6876, 45623, 23640, 40116, 21040, 500, 14390, 53162}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{20562, 45639, 17119, 6385}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 61726), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{38469, 24214, 44861, 48992, 6861, 58302, 26377, 48824, 31844, 51962, 63415, 49282, 57501, 20365, 43476, 34962}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, onBoardingActivity)).intValue();
            Object[] objArr25 = {-1558022759};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42049), 1726 - View.getDefaultSize(0, 0), View.MeasureSpec.getSize(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 785115777);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                short s10 = (short) 51;
                Object[] objArr26 = new Object[1];
                c(s10, (byte) (s10 + 1), $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cCombineMeasuredStates, packedPositionChild, iCombineMeasuredStates, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{52999, 29689, 18952, 25036}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{15096, 2333, 23489, 52085, 14206, 6300, 59583, 37102, 31350, 64899, 541, 21822, 1274, 2373, 32629, 4194, 39710, 43892, 56940, 32391, 26721, 42976}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{17843, 44938, 9616, 55559}, (char) (1829 - (Process.myPid() >> 22)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_smile).substring(4, 5).codePointAt(0) - 1867544096, new char[]{59190, 13825, 37083, 41163, 34172, 9059, 62368, 24795, 21432, 51967, 39095, 41807, 34550, 30647, 57684}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                    int iIndexOf5 = TextUtils.indexOf("", "") + 1755;
                    int i39 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                    Object[] objArr29 = new Object[1];
                    c((short) 140, (byte) 52, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(defaultSize, iIndexOf5, i39, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                    int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iGreen = Color.green(0) + 23;
                    short s11 = (short) ($$b & 383);
                    Object[] objArr30 = new Object[1];
                    c(s11, (byte) (s11 & 189), $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maxKeyCode, maximumFlingVelocity, iGreen, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i41 == i40) {
            int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int iMyTid2 = Process.myTid();
            int i43 = i42 + (-1144866607) + (((~((-145654766) | iMyTid2)) | 11305548) * 336) + (((~(iMyTid2 | 66947660)) | (-201296878)) * (-168)) + (((~((~iMyTid2) | 66947660)) | (-145654766)) * 168);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[3])[0] = i45 ^ (i45 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i46 = f573a + 71;
                d = i46 % 128;
                int i47 = i46 % 2;
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i41 / (((i41 - 1) * i41) % 2), 0).show();
        int i48 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int iNextInt2 = new Random().nextInt(749766155);
        int i49 = ~iNextInt2;
        int i50 = i48 + (-1985169576) + ((iNextInt2 | 75022179) * (-859)) + (((~(iNextInt2 | (-3149379))) | (~(75022179 | i49))) * 859) + (((~((-137580247) | i49)) | 134430868) * 859);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr32[3])[0] = i52 ^ (i52 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f573a + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i5 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels) | (-1491392749));
        if (i4 != (((-2146238206) | i5) * (-970)) + 833157714 + ((i5 | 654845457) * 970)) {
            int i6 = (-511780230) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i7 != ((~((~iIdentityHashCode) | (-1345454209))) * 130) + 1412066072 + (((~(iIdentityHashCode | (-1345454209))) | 84165666) * 130)) {
            throw new RuntimeException("2125928317");
        }
        super.onResume();
        int i8 = f573a + 107;
        d = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00b8  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = d + 57;
        f573a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            if (i3 != 2047873600 + (((~((-259817841) | i4)) | 252215600) * 345) + (((~((-259817841) | (~i4))) | (-1342020984)) * 345) + ((~(i4 | (-252215601))) * 345)) {
                int[] iArr = new int[984229172];
                iArr[984229171] = 1;
                int i5 = (-1009914532) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i6 = d + 115;
                f573a = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            int i8 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i9 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_klikbca2).substring(15, 16).codePointAt(0) + 1388206236) | (-1291283630));
            if (i8 != (-340227984) + (((-461296087) | i9) * (-220)) + ((i9 | 1149316137) * 220) + 1657836728) {
                int[] iArr2 = new int[984229172];
                iArr2[984229171] = 1;
                int i10 = (-1009914532) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i11 = d + 115;
                f573a = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        int i13 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i14 = (~((-1631640695) | iUptimeMillis)) | 541083750;
        int i15 = ~iUptimeMillis;
        if (i13 != (-457941760) + ((i14 | (~(2037972214 | i15))) * 886) + (((~(i15 | 1631640694)) | 947415270) * (-1772)) + ((~(i15 | 947415270)) * 886)) {
            throw new RuntimeException("-1583750319");
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f573a + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_atm_bersama).substring(1, 3).length() - 1058035205;
        int i5 = ~length;
        if (i4 != (-1530675584) + (((~(1473504796 | i5)) | 643517253) * 226) + (((~(i5 | 2010902365)) | (~((-643517254) | length)) | 106119684) * (-113)) + ((~(length | 1473504796)) * 113)) {
            throw new RuntimeException("-1967193991");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i7 = ~iMyUid;
        if (i6 != ((((~((-1837439415) | i7)) | (~(iMyUid | 741616550))) * 959) - 343049429) + (((~(iMyUid | (-1837439415))) | (~(i7 | 741616550))) * 959)) {
            throw new RuntimeException("2058189063");
        }
        super.onCreate(bundle);
        int i8 = d + 63;
        f573a = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 31 / 0;
        }
    }

    public static /* synthetic */ WindowInsetsCompat TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = d + 83;
        f573a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        int i4 = d + 39;
        f573a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return windowInsetsCompat;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OnBoardingActivity onBoardingActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 125;
        f573a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onBoardingActivity, null, true, 9);
                onBoardingActivity.finish();
            } else {
                LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onBoardingActivity, null, false, 6);
                onBoardingActivity.finish();
            }
            ViewPortBuilder.b();
            int i4 = f573a + 67;
            d = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        OnBoardingActivity onBoardingActivity = (OnBoardingActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = d + 25;
        f573a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            int currentItem = ((ActivityOnboardingBinding) ((ViewBinding) onBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpOnboarding.getCurrentItem();
            onBoardingActivity.b = currentItem;
            onExtraCallback onextracallback = onBoardingActivity.TuitionPaymentFragmentbindingInflater1;
            Object obj = null;
            if (onextracallback == null) {
                int i4 = d + 95;
                f573a = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                onextracallback = null;
            }
            if (currentItem < onextracallback.getCount() - 1) {
                onBoardingActivity.b++;
                ((ActivityOnboardingBinding) ((ViewBinding) onBoardingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).vpOnboarding.setCurrentItem(onBoardingActivity.b);
            } else {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onBoardingActivity, null, false, 6);
                onBoardingActivity.finish();
            }
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(OnBoardingActivity onBoardingActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1118639145, 1118639145, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{onBoardingActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    static {
        onTransact = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 119;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentbindingInflater1 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 770879010, iTuitionPaymentFragmentbindingInflater1, 684903902, -684903900, ensureLogoView.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, ensureLogoView.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 27;
        f573a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = d + 101;
        f573a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = d + 3;
        f573a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f573a + 63;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 51;
        f573a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 115;
        f573a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentbindingInflater1 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentbindingInflater1, 1350648788, -1350648787, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 399989056, new Object[]{this, context}, ensureLogoView.TuitionPaymentFragmentbindingInflater1());
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        asInterface = -981105359;
        asBinder = (char) 51285;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, int r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = 1 - r5
            byte[] r1 = com.bpjstku.presentation.onboarding.OnBoardingActivity.$$c
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = 104 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r4 = r1[r6]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.onboarding.OnBoardingActivity.$$i(int, int, byte):java.lang.String");
    }
}
