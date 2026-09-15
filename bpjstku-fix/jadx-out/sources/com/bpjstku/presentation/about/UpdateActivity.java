package com.bpjstku.presentation.about;

import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityUpdateBinding;
import com.bpjstku.presentation.about.UpdateActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_face.zznv;
import com.google.android.material.button.MaterialButton;
import com.midtrans.sdk.corekit.BuildConfig;
import defpackage.ApiCompatApi29Impl;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.mapPoint;
import defpackage.onBackPressedDispatcher_delegatelambda010;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\f8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00128UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000f8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/presentation/about/UpdateActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityUpdateBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "onBackPressed", "LApiCompatApi29Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentbindingInflater1", "I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdateActivity extends BindingBaseActivity<ActivityUpdateBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_update;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 48, -62, 38, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 241;
    private static int g = 0;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f449a = 1;

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i3);
        int i11 = i9 | i10 | (~(i4 | i));
        int i12 = i8 | i4;
        int i13 = (~((~i) | i4)) | i10;
        int i14 = i4 + i3 + i2 + (111814883 * i6) + (1975835455 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i4) - 1583611904) + (47848387 * i3) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i2) + ((-648806400) * i6) + (1432616960 * i5) + (442957824 * i15);
        int i17 = ((i4 * 961080817) - 60187382) + (i3 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i2 * 961079685) + (i6 * 1618335983) + (i5 * 193609403) + (i15 * 1988296704);
        int i18 = i16 + (i17 * i17 * 176226304);
        if (i18 != 1) {
            return i18 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = r5 + 1
            byte[] r1 = com.bpjstku.presentation.about.UpdateActivity.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.UpdateActivity.c(int, short, int, java.lang.Object[]):void");
    }

    public UpdateActivity() {
        final UpdateActivity updateActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ApiCompatApi29Impl>() { // from class: com.bpjstku.presentation.about.UpdateActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ApiCompatApi29Impl, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ApiCompatApi29Impl invoke() {
                LifecycleOwner lifecycleOwner = updateActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApiCompatApi29Impl.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.about.UpdateActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/about/UpdateActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) UpdateActivity.class);
            intent.addFlags(67141632);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityUpdateBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f449a + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        UpdateActivity$bindingInflater$1 updateActivity$bindingInflater$1 = UpdateActivity$bindingInflater$1.b;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return updateActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        UpdateActivity updateActivity = (UpdateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 69;
        f449a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = updateActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            return Integer.valueOf(i4);
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityUpdateBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnUpdateApplication;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ActivityResultContractsOpenMultipleDocuments
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdateActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = asBinder + 49;
        f449a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
    }

    private static final Unit TuitionPaymentFragmentbindingInflater1(UpdateActivity updateActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        try {
            String packageName = updateActivity.getPackageName();
            StringBuilder sb = new StringBuilder(BuildConfig.PLAY_STORE_URL);
            sb.append(packageName);
            updateActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            updateActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(BuildConfig.PLAY_STORE_URL.concat(String.valueOf(updateActivity.getPackageName())))));
        }
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 45;
        f449a = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        f449a = i2 % 128;
        int i3 = i2 % 2;
        ActivityUpdateBinding activityUpdateBinding = (ActivityUpdateBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityUpdateBinding.tvForceUpdateTitle;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        textView.setText(getMaxImages.read());
        TextView textView2 = activityUpdateBinding.tvForceUpdateContent;
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        textView2.setText((String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 1215466093, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1215466086));
        MaterialButton materialButton = activityUpdateBinding.btnUpdateApplication;
        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
        materialButton.setText(getMaxImages.IconCompatParcelizer());
        int i4 = f449a + 21;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        f449a = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        if (this.TuitionPaymentFragmentbindingInflater1 != 1) {
            this.TuitionPaymentFragmentbindingInflater1 = 1;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "tekan sekali lagi untuk keluar", 0).show();
            int i4 = f449a + 17;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = asBinder + 27;
        f449a = i6 % 128;
        if (i6 % 2 != 0) {
            finish();
        } else {
            finish();
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f449a + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
            int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
            int i4 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$a;
            byte b = (byte) (bArr[3] - 1);
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) s, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, absoluteGravity, i4, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c((byte) 52, (short) (bArr2[3] - 1), bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, bitsPerPixel, iKeyCodeFromString, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i6 = 1010136612 + (((~((~i5) | 384959273)) | 134608070) * 529) + (((~(i5 | 384959273)) | 172356847) * 529) + 1383123559;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{340350519, -37579187, 1591180734, 626357725, -828487131, 126223654, 422895234, -1891534487, -529848343, 354301927}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_details_error_message).substring(8, 9).codePointAt(0) - 81, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{386127799, 797774081, -1402136537, 806950439, -530465038, 1540921617, 621581431, -1444232023, -2077653485, 423523259}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 96, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1679550487};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42049), 1725 - TextUtils.indexOf((CharSequence) "", '0'), 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1383123559, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 23;
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c((byte) 52, (short) (bArr3[3] - 1), bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iLastIndexOf, absoluteGravity2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-1111361649, -2100871089, -1026882337, 1272951634, -1967917286, -966562842, -707554028, 1314141909, -779086544, -1114710855, 217357389, -2110602748, -1468811311, -645863785}, Color.rgb(0, 0, 0) + 16777238, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{-2137235630, 884453487, 2092445039, 1562044712, -145126694, 339337215, 795322893, -1862373832, -626293105, 1790329463}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 101, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                        int iGreen = 1755 - Color.green(0);
                        int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                        Object[] objArr11 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iGreen, scrollBarSize, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                        int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                        byte[] bArr4 = $$a;
                        byte b2 = (byte) (bArr4[3] - 1);
                        short s2 = bArr4[7];
                        Object[] objArr12 = new Object[1];
                        c(b2, s2, (byte) s2, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, absoluteGravity3, iMakeMeasureSpec, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iMyUid = Process.myUid();
            int i12 = i11 + (-120790168) + (((~((-653541835) | iMyUid)) | 615792714) * 345) + (((~((-653541835) | (~iMyUid))) | (-1056732123)) * 345) + ((~(iMyUid | (-615792715))) * 345);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i10];
            int i15 = i10 - 1;
            iArr[i15] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i15) % 2) - 1], 1).show();
            int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode;
            int i18 = i16 + 1189776958 + (((~((-89263174) | i17)) | 123339252) * (-90)) + (((~((-89263174) | iIdentityHashCode)) | (-123342326)) * (-45)) + (((~(iIdentityHashCode | (-123339253))) | (-89263174) | (~(i17 | 123339252))) * 45);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr14[3])[0] = i20 ^ (i20 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
            int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
            int i21 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr15 = new Object[1];
            c((byte) 52, (short) 141, $$a[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, tapTimeout, i21, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new int[]{-1111361649, -2100871089, -1026882337, 1272951634, -1967917286, -966562842, -707554028, 1314141909, -779086544, -1114710855, 217357389, -2110602748, -1468811311, -645863785}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto2).substring(8, 9).codePointAt(0) - 75, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new int[]{-2137235630, 884453487, 2092445039, 1562044712, -145126694, 339337215, 795322893, -1862373832, -626293105, 1790329463}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 15;
            byte[] bArr5 = $$a;
            short s3 = (short) (bArr5[3] - 1);
            byte b3 = bArr5[7];
            Object[] objArr18 = new Object[1];
            c((byte) 52, s3, b3, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(defaultSize, keyRepeatTimeout, absoluteGravity4, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int gidForName = 1030 - Process.getGidForName("");
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                byte[] bArr6 = $$a;
                byte b4 = bArr6[7];
                Object[] objArr19 = new Object[1];
                c(b4, (short) (b4 | 193), bArr6[5], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength, gidForName, scrollBarFadeDuration2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr20[3])[0];
            int i23 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i24 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i25 = ~((-312508419) | i24);
            int i26 = ~i24;
            int i27 = (-1155175919) + ((i25 | (~(402503647 | i26))) * 920) + (((~((-334275400) | i26)) | 312508418) * 920) + (((~(i24 | 402503647)) | (~((-312508419) | i26)) | (~((-21766982) | i24))) * 920) + 79846740;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new int[]{340350519, -37579187, 1591180734, 626357725, -828487131, 126223654, 422895234, -1891534487, -529848343, 354301927}, 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new int[]{386127799, 797774081, -1402136537, 806950439, -530465038, 1540921617, 621581431, -1444232023, -2077653485, 423523259}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.seconds).substring(1, 2).codePointAt(0) - 85, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1679550487};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1134 - (ViewConfiguration.getEdgeSlop() >> 16), 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 79846740, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                int iArgb = Color.argb(0, 0, 0, 0) + 15;
                Object[] objArr25 = new Object[1];
                c((byte) 52, (short) 141, $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(offsetAfter, maximumFlingVelocity, iArgb, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 1117, (Process.myPid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int i30 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                int gidForName2 = Process.getGidForName("") + 16;
                byte[] bArr7 = $$a;
                byte b5 = bArr7[7];
                Object[] objArr26 = new Object[1];
                c(b5, (short) (b5 | 193), bArr7[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveSizeAndState, i30, gidForName2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{-1111361649, -2100871089, -1026882337, 1272951634, -1967917286, -966562842, -707554028, 1314141909, -779086544, -1114710855, 217357389, -2110602748, -1468811311, -645863785}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_alto).substring(1, 3).length() + 20, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{-2137235630, 884453487, 2092445039, 1562044712, -145126694, 339337215, 795322893, -1862373832, -626293105, 1790329463}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).length() + 13, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int keyRepeatDelay = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr8 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) (bArr8[3] - 1), bArr8[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, keyRepeatDelay, packedPositionGroup, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 1031;
                    int iMyPid = (Process.myPid() >> 22) + 15;
                    Object[] objArr30 = new Object[1];
                    c((byte) 52, (short) 141, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(doubleTapTimeout, iArgb2, iMyPid, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i31 = f449a + 113;
                asBinder = i31 % 128;
                int i32 = i31 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i36 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i37 = i33 + (-2140082559) + (((~(618917774 | i36)) | 319819888) * 336) + (((~(i36 | 863197944)) | 75539718) * (-168)) + (((~((~i36) | 863197944)) | 618917774) * 168);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[2])[0] = i39 ^ (i39 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i40 = asBinder + 79;
        f449a = i40 % 128;
        int i41 = i40 % 2;
        for (String str2 : strArr4) {
            arrayList2.add(str2);
        }
        throw null;
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 103;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i5) + 3291;
                        int iIndexOf = 30 - TextUtils.indexOf("", c, i5, i5);
                        byte b = (byte) i5;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, iNormalizeMetaState, iIndexOf, 1948206109, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    c = '0';
                    i3 = -1870535734;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        float f = 0.0f;
        if (iArr5 != null) {
            int i8 = $10 + 63;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr5[i10]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3291;
                    int i11 = 31 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1));
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, keyRepeatTimeout, i11, 1948206109, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i10++;
                iArr5 = iArr5;
                f = 0.0f;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        int i12 = $10 + 123;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 19;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = $10 + 73;
            $11 = i16 % 128;
            int i17 = 2;
            int i18 = i16 % 2;
            int i19 = 17;
            while (i19 > 1) {
                int i20 = $10 + 111;
                $11 = i20 % 128;
                if (i20 % i17 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i19];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), KeyEvent.getDeadChar(0, 0) + 2559, View.combineMeasuredStates(0, 0) + 29, 683220507, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i19 += 35;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i19];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.green(0), KeyEvent.keyCodeFromString("") + 2559, 28 - TextUtils.lastIndexOf("", '0', 0), 683220507, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i19--;
                }
                i17 = 2;
            }
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28879), View.MeasureSpec.getSize(0) + 348, 25 - TextUtils.indexOf("", ""), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        f449a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i4 != 1420565080 + (((~iNextInt) | 914927081) * 1444) + (((~(iNextInt | (-1026864755))) | (~(196877211 | iNextInt)) | 872457312) * (-1444)) + 847610380) {
            int i5 = 1216540718 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        if (i6 != 1416962304 + ((~((-1082425345) | i7)) * 623) + (((~i7) | 18882716) * (-623)) + (((~(i7 | 757756668)) | (~((-1821299297) | i7)) | 1082425344) * 623)) {
            throw new RuntimeException("1470733442");
        }
        super.onResume();
        int i8 = f449a + 53;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x006f  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        f449a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int i4 = (int) Runtime.getRuntime().totalMemory();
            if (i3 != (((-1134047304) + (((~i4) | 10498377) * 1324)) + (((~(i4 | (-911855155))) | (~(81867611 | i4))) * (-1324))) - 710889500) {
                int[] iArr = new int[1723071714];
                iArr[1723071713] = 1;
                int i5 = 1327872674 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i6 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i7 = ~(((int) Process.getStartUptimeMillis()) | (-896566448));
            if (i6 != ((598206136 + (((-66578905) | i7) * (-220))) + ((i7 | 872416295) * 220)) - 1848707472) {
                int[] iArr2 = new int[1723071714];
                iArr2[1723071713] = 1;
                int i8 = 1327872674 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i11 = ~i10;
        int i12 = (~(1865516368 | i11)) | 13257389;
        int i13 = ~(i10 | (-1729168721));
        if (i9 != ((i12 | i13) * (-252)) + 1624950696 + ((i13 | (~(i11 | 1878773757))) * 252)) {
            throw new RuntimeException("-1756460566");
        }
        super.onStart();
        int i14 = asBinder + 19;
        f449a = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1562951982
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = android.os.Process.myPid()
            int r5 = ~r4
            r6 = -562285932(0xffffffffde7c3294, float:-4.5431875E18)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 553878825(0x21038529, float:4.456076E-19)
            r6 = r6 | r7
            r7 = -1383866369(0xffffffffad83dfff, float:-1.499245E-11)
            r4 = r4 | r7
            int r4 = ~r4
            r6 = r6 | r4
            int r6 = r6 * (-502)
            r7 = -1955691634(0xffffffff8b6e838e, float:-4.5936103E-32)
            int r7 = r7 + r6
            r6 = -8407107(0xffffffffff7fb7bd, float:-3.3990716E38)
            r5 = r5 | r6
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 502
            int r7 = r7 + r4
            if (r1 != r7) goto Lab
            java.lang.reflect.Member[] r1 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            r5 = 1816281843(0x6c4242f3, float:9.393911E26)
            int r4 = r4.nextInt(r5)
            int r5 = ~r4
            r6 = 2067365464(0x7b397e58, float:9.631375E35)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = -351454134(0xffffffffeb0d3c4a, float:-1.7074325E26)
            r7 = r7 | r4
            int r7 = ~r7
            r6 = r6 | r7
            int r6 = r6 * 210
            r7 = 1733081406(0x674cb93e, float:9.667799E23)
            int r7 = r7 + r6
            r6 = -271598097(0xffffffffefcfbdef, float:-1.2858603E29)
            r5 = r5 | r6
            int r5 = ~r5
            r6 = 2147221501(0x7ffbfffd, float:NaN)
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 210
            int r7 = r7 + r4
            if (r1 == r7) goto La7
            int r1 = com.bpjstku.presentation.about.UpdateActivity.f449a
            int r1 = r1 + 19
            int r4 = r1 % 128
            com.bpjstku.presentation.about.UpdateActivity.asBinder = r4
            int r1 = r1 % r0
            r4 = -1
            r5 = -1562951983(0xffffffffa2d73ed1, float:-5.8342376E-18)
            r6 = -1562951982(0xffffffffa2d73ed2, float:-5.834238E-18)
            if (r1 == 0) goto L8c
            int[] r1 = new int[r6]
            r1[r5] = r2
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
            goto L9e
        L8c:
            int[] r1 = new int[r6]
            r2 = 1
            r1[r5] = r2
            r5 = -1185995406(0xffffffffb94f2572, float:-1.9755008E-4)
            int r5 = r5 % r0
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r2)
            r1.show()
        L9e:
            int r1 = com.bpjstku.presentation.about.UpdateActivity.asBinder
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.bpjstku.presentation.about.UpdateActivity.f449a = r2
            int r1 = r1 % r0
        La7:
            super.onCreate(r9)
            return
        Lab:
            r9 = 2015921372(0x782884dc, float:1.3671884E34)
            int r9 = r9 % r0
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.about.UpdateActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(UpdateActivity updateActivity, View view) {
        int i = 2 % 2;
        int i2 = f449a + 45;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentbindingInflater1(updateActivity, view);
            obj.hashCode();
            throw null;
        }
        Unit unitTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(updateActivity, view);
        int i3 = f449a + 93;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitTuitionPaymentFragmentbindingInflater1;
        }
        obj.hashCode();
        throw null;
    }

    static {
        asInterface = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 83;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Integer) b(onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1(), zznv.b(), new Object[]{this}, 733051390, -733051390, zznv.b(), onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1())).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f449a + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        b(onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1(), zznv.b(), new Object[]{this}, -726570358, 726570360, onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1(), onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f449a + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        b(onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 731824564, new Object[]{this}, -1854509336, 1854509337, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_4).substring(3, 4).codePointAt(0) + 1316722514, onBackPressedDispatcher_delegatelambda010.TuitionPaymentFragmentbindingInflater1());
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[]{1181681695, 1708401643, 314592010, 1443384138, 131745248, 1782047715, 2104060456, 257087063, -2108947256, 868203524, -533387071, 1884974830, 883043696, 1512173827, -1450276843, 397180333, 1647765754, 597378317};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        UpdateActivity updateActivity = (UpdateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f449a + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return null;
        }
        int i4 = 92 / 0;
        return null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f449a + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static String $$i(byte b, int i, byte b2) {
        int i2 = (b2 * 56) + 66;
        byte[] bArr = $$c;
        int i3 = b * 3;
        int i4 = 3 - (i * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = i4 + i2;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i4 + 1;
            i6 = i7;
            i2 = bArr[i8] + i2;
            i4 = i8;
        }
    }
}
