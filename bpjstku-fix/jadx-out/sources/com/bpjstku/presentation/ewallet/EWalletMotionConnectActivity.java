package com.bpjstku.presentation.ewallet;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionLinkingRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.databinding.ActivityEwalletConnectBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.EditProfileActivity;
import com.bpjstku.presentation.ewallet.EWalletMotionConnectActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.changeMenuMode;
import defpackage.createExtraImageCapture;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getHeaderTitle;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0016\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0015\u0010\u0012\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/ewallet/EWalletMotionConnectActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityEwalletConnectBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LgetHeaderTitle;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EWalletMotionConnectActivity extends BindingBaseActivity<ActivityEwalletConnectBinding> {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static long b;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new EWalletMotionConnectActivity$special$$inlined$inject$default$1(this));
    private static final byte[] $$c = {118, 35, -100, -35};
    private static final int $$f = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {36, -74, -79, -21, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 19;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f489a = 0;
    private static int d = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i6 | i3)) | (~(i5 | i3));
        int i10 = ~i5;
        int i11 = (~(i10 | i3)) | i6;
        int i12 = (~(i3 | i6 | i5)) | (~(i8 | i10));
        int i13 = i6 + i5 + i + ((-373584967) * i2) + ((-1711780345) * i4);
        int i14 = i13 * i13;
        int i15 = (i6 * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i) + ((-375259136) * i2) + ((-1109524480) * i4) + (585564160 * i14);
        int i16 = ((i6 * 235012993) - 778813113) + (i5 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i * 235013625) + (i2 * 915899377) + (i4 * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        if (i17 != 1) {
            return i17 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    private static void c(short s, short s2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 196 - s2;
        int i3 = (s * 14) + 84;
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + i3) - 11;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i2 + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + bArr[i6]) - 11;
            i2 = i6;
            i5 = i7;
        }
    }

    public EWalletMotionConnectActivity() {
        final EWalletMotionConnectActivity eWalletMotionConnectActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getHeaderTitle>() { // from class: com.bpjstku.presentation.ewallet.EWalletMotionConnectActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getHeaderTitle] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getHeaderTitle invoke() {
                LifecycleOwner lifecycleOwner = eWalletMotionConnectActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getHeaderTitle.class);
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 17;
        f489a = i2 % 128;
        int i3 = i2 % 2;
        EWalletMotionConnectActivity$bindingInflater$1 eWalletMotionConnectActivity$bindingInflater$1 = EWalletMotionConnectActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = f489a + 47;
        d = i4 % 128;
        int i5 = i4 % 2;
        return eWalletMotionConnectActivity$bindingInflater$1;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.ewallet.EWalletMotionConnectActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/ewallet/EWalletMotionConnectActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) EWalletMotionConnectActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityEwalletConnectBinding activityEwalletConnectBinding = (ActivityEwalletConnectBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        MaterialButton materialButton = activityEwalletConnectBinding.actEwconnectPhoneChange;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: findGroupIndex
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EWalletMotionConnectActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        MaterialButton materialButton2 = activityEwalletConnectBinding.actEwconnectConnect;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: findItemsWithShortcutForKey
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) EWalletMotionConnectActivity.TuitionPaymentFragmentbindingInflater1(new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj}, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1890828837, -1890828837);
            }
        }));
        int i2 = f489a + 55;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((getHeaderTitle) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: findItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EWalletMotionConnectActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = f489a + 117;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        int i2 = d + 89;
        f489a = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentbindingInflater1(((ActivityEwalletConnectBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityEwalletConnectBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText("");
        TextView textView = ((ActivityEwalletConnectBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actEwconnectPhone;
        try {
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null));
        } catch (Exception unused) {
        }
        textView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i4 = d + 57;
        f489a = i4 % 128;
        int i5 = i4 % 2;
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
            int i4 = $11 + 93;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 8329), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1234, 35 - Drawable.resolveOpacity(0, 0), -653973969, false, $$i(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), 2764 - TextUtils.indexOf("", "", 0, 0), KeyEvent.keyCodeFromString("") + 14, 1504416861, false, $$i(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ExpandableListView.getPackedPositionType(0L) + 253, Color.rgb(0, 0, 0) + 16777238, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 65200), 2892 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2012627446, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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
        int i6 = $10 + 23;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = f489a + 111;
                d = i2 % 128;
                int i3 = i2 % 2;
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = f489a + 5;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = d + 111;
        f489a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
            int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b2, (short) (b2 | 193), (byte) ($$b - 4), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, iResolveSizeAndState, modifierMetaStateMask, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29945);
                int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr3 = new Object[1];
                c(b4, (short) (b4 | 156), b3, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i4, maximumFlingVelocity, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i5 = 1150781103 + (((~((-188813456) | layoutDirection)) | (-23788971)) * (-318));
            int i6 = ~((-23788971) | layoutDirection);
            int i7 = ~layoutDirection;
            int i8 = ((i5 + ((i6 | (~(191626671 | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) + (((~(layoutDirection | 191626671)) | (~((-2813217) | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 478727058;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i10 ^ (i10 << 5);
            int i11 = d + 87;
            f489a = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{9616, 39256, 51669, 51477}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 5541), TextUtils.getOffsetBefore("", 0), new char[]{61331, 29848, 22530, 34668, 64219, 12894, 30261, 3338, 21812, 57155, 19471, 27011, 23007, 19051, 15582, 33931}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{55832, 45802, 2197, 59608}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 55187), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{20662, 4736, 4459, 56924, 18520, 46955, 12291, 48955, 27200, 16931, 40733, 10207, 35727, 22161, 28049, 61826}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-73187749};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 42049), 1726 - Color.green(0), 29 - KeyEvent.getDeadChar(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -478727058, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 23;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr8 = new Object[1];
                    c(b6, (short) (b6 | 156), b5, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iIndexOf, iIndexOf2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{10497, 18547, 47622, 46128}, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notificationOpenAppToActivateBody).substring(0, 65).codePointAt(40) - 111, new char[]{23327, 7932, 54647, 4815, 24577, 40928, 45077, 34520, 58137, 43422, 30197, 50971, 10197, 50782, 44256, 62940, 22007, 1854, 7646, 8199, 29423, 64521}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{23881, 44464, 42133, 40768}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_sdk_general_error).substring(0, 45).length() + 16503), (-1783779235) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{44633, 28803, 30040, 41492, 11199, 36933, 21300, 45800, 12862, 24397, 33684, 63501, 61951, 49158, 36239}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                        int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr11 = new Object[1];
                        c(b8, (short) (b8 | 104), b7, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, minimumFlingVelocity, bitsPerPixel, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                        int iGreen = Color.green(0) + 1755;
                        int absoluteGravity2 = 23 - Gravity.getAbsoluteGravity(0, 0);
                        byte b9 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c(b9, (short) (b9 | 193), (byte) ($$b - 4), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, iGreen, absoluteGravity2, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i13 = f489a + 101;
                    d = i13 % 128;
                    int i14 = i13 % 2;
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
        int i15 = ((int[]) objArrB$7879113[1])[0];
        int i16 = ((int[]) objArrB$7879113[0])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i17 = d + 99;
                f489a = i17 % 128;
                for (int i18 = i17 % 2 == 0 ? 0 : 1; i18 < strArr.length; i18++) {
                    arrayList.add(strArr[i18]);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i19 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = i19 + 1564361141 + ((iIdentityHashCode | 33753376) * 988) + (((~(655825312 | i20)) | (-1065294823)) * (-1976)) + (((~(iIdentityHashCode | 443222886)) | 33753376 | (~((-443222887) | i20))) * 988);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr13[3])[0] = i23 ^ (i23 << 5);
        int i24 = f489a + 41;
        d = i24 % 128;
        int i25 = i24 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int mode = View.MeasureSpec.getMode(0) + 1031;
            int mode2 = 15 - View.MeasureSpec.getMode(0);
            byte b10 = $$a[7];
            byte b11 = b10;
            Object[] objArr14 = new Object[1];
            c(b11, (short) (b11 | 52), b10, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel2, mode, mode2, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{10497, 18547, 47622, 46128}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, new char[]{23327, 7932, 54647, 4815, 24577, 40928, 45077, 34520, 58137, 43422, 30197, 50971, 10197, 50782, 44256, 62940, 22007, 1854, 7646, 8199, 29423, 64521}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{23881, 44464, 42133, 40768}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 16502), (-1783779235) - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{44633, 28803, 30040, 41492, 11199, 36933, 21300, 45800, 12862, 24397, 33684, 63501, 61951, 49158, 36239}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int i26 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int mirror = '?' - AndroidCharacter.getMirror('0');
            byte b12 = $$a[7];
            byte b13 = b12;
            Object[] objArr17 = new Object[1];
            c(b13, (short) (b13 | 156), b12, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i26, mirror, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int i27 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                byte[] bArr = $$a;
                byte b14 = bArr[28];
                short s = bArr[7];
                Object[] objArr18 = new Object[1];
                c(b14, s, (byte) (s | 52), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, packedPositionType, i27, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr19[3])[0];
            int i29 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i30 = ~startUptimeMillis;
            int i31 = (((6989701 + (((~(startUptimeMillis | 218626793)) | ((~((-17264769) | i30)) | (-227015402))) * (-68))) + ((~((-8388609) | i30)) * (-68))) + (((~((-218626794) | i30)) | (-25653377)) * 68)) - 1976367652;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{9616, 39256, 51669, 51477}, (char) (View.resolveSizeAndState(0, 0, 0) + 5577), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{61331, 29848, 22530, 34668, 64219, 12894, 30261, 3338, 21812, 57155, 19471, 27011, 23007, 19051, 15582, 33931}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{55832, 45802, 2197, 59608}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_promo_amount).substring(4, 5).length() + 55303), (-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{20662, 4736, 4459, 56924, 18520, 46955, 12291, 48955, 27200, 16931, 40733, 10207, 35727, 22161, 28049, 61826}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-73187749};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - Color.green(0)), 1134 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 18 - (Process.myTid() >> 22), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1976367652, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                int maximumFlingVelocity2 = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b15 = $$a[7];
                byte b16 = b15;
                Object[] objArr24 = new Object[1];
                c(b16, (short) (b16 | 52), b15, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(gidForName, iAxisFromString, maximumFlingVelocity2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.green(0) + 45993), 1117 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iRed = 1031 - Color.red(0);
                int windowTouchSlop = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr2 = $$a;
                byte b17 = bArr2[28];
                short s2 = bArr2[7];
                Object[] objArr25 = new Object[1];
                c(b17, s2, (byte) (s2 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, iRed, windowTouchSlop, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{10497, 18547, 47622, 46128}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardCriticalTitle).substring(0, 17).codePointAt(1) - 73), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_name_on_card).substring(0, 3).length() - 3, new char[]{23327, 7932, 54647, 4815, 24577, 40928, 45077, 34520, 58137, 43422, 30197, 50971, 10197, 50782, 44256, 62940, 22007, 1854, 7646, 8199, 29423, 64521}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{23881, 44464, 42133, 40768}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1066).substring(0, 54).length() + 16494), Color.green(0) - 1783779235, new char[]{44633, 28803, 30040, 41492, 11199, 36933, 21300, 45800, 12862, 24397, 33684, 63501, 61951, 49158, 36239}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                    byte b18 = $$a[7];
                    byte b19 = b18;
                    Object[] objArr28 = new Object[1];
                    c(b19, (short) (b19 | 156), b18, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, iLastIndexOf, deadChar, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                    int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                    byte b20 = $$a[7];
                    byte b21 = b20;
                    Object[] objArr29 = new Object[1];
                    c(b21, (short) (b21 | 52), b20, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, maximumDrawingCacheSize, offsetAfter, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArr[1])[0];
        int i35 = ((int[]) objArr[3])[0];
        if (i35 == i34) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[3])[0];
            int i38 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i39 = ~iIdentityHashCode2;
            int i40 = 1600317985 + (((~((-269975681) | i39)) | (~((-665343296) | iIdentityHashCode2))) * 520);
            int i41 = ~(665343295 | i39);
            int i42 = ~(iIdentityHashCode2 | 909623465);
            int i43 = i36 + i40 + ((i41 | i42) * (-1040)) + ((i42 | (~(i39 | (-909623466))) | (-935318976)) * 520);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr30[2])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i46 = f489a + 21;
            d = i46 % 128;
            int i47 = i46 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i35 / (((i35 - 1) * i35) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i48 = ((int[]) objArr[2])[0];
        int i49 = ((int[]) objArr[3])[0];
        int i50 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i51 = i48 + (-1410750159) + ((1049734070 | iIdentityHashCode3) * 376) + (((~((~iIdentityHashCode3) | 670735321)) | 402726950) * (-376)) + (((~(iIdentityHashCode3 | (-670735322))) | (-426455152)) * 376);
        int i52 = i51 ^ (i51 << 13);
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr31[2])[0] = i53 ^ (i53 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1239900228
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
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ewallet.EWalletMotionConnectActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f489a + 101;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != (((~(1067195309 | i5)) | (~(iIdentityHashCode | 237207766))) * 959) + 257080163 + (((~(iIdentityHashCode | 1067195309)) | (~(i5 | 237207766))) * 959)) {
            throw new RuntimeException("-1151425406");
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = (int) Runtime.getRuntime().totalMemory();
        int i8 = ~i7;
        if (i6 != 607248884 + (((~(1975224064 | i8)) | (~((-259312734) | i7))) * 1900) + (((~(i8 | 259312733)) | (~(i7 | (-1975224065)))) * (-950)) + (((~(i7 | 259312733)) | (~(i8 | (-1975224065)))) * 950)) {
            throw null;
        }
        super.onStart();
        int i9 = d + 5;
        f489a = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f489a + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i5 = ~layoutDirection;
        if (i4 != (-920667670) + (((~(i5 | (-1647339781))) | 817352237) * (-1042)) + (((-1647339781) | layoutDirection) * 521) + (((~(layoutDirection | (-817352238))) | 277317161 | (~(i5 | (-1107304705)))) * 521)) {
            int i6 = (-1264465170) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i7 != (-1082856870) + (((~(startElapsedRealtime | 117767181)) | 1749746352) * 305) + (((~((~startElapsedRealtime) | 117767181)) | 1833678512) * 305)) {
            throw new RuntimeException("1946697762");
        }
        super.onCreate(bundle);
        int i8 = f489a + 95;
        d = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit b(EWalletMotionConnectActivity eWalletMotionConnectActivity) {
        int i = 2 % 2;
        int i2 = d + 51;
        f489a = i2 % 128;
        int i3 = i2 % 2;
        eWalletMotionConnectActivity.finish();
        EditProfileActivity.Companion companion = EditProfileActivity.INSTANCE;
        EditProfileActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(eWalletMotionConnectActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = d + 101;
        f489a = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final EWalletMotionConnectActivity eWalletMotionConnectActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        changeMenuMode changemenumode = new changeMenuMode(new Function0() { // from class: dispatchMenuItemSelected
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EWalletMotionConnectActivity.b(this.b);
            }
        });
        FragmentManager supportFragmentManager = eWalletMotionConnectActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(changemenumode.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = d + 59;
            f489a = i2 % 128;
            int i3 = i2 % 2;
            changemenumode.show(supportFragmentManager, changemenumode.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = d + 95;
        f489a = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String str;
        EWalletMotionConnectActivity eWalletMotionConnectActivity = (EWalletMotionConnectActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = f489a + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        final getHeaderTitle getheadertitle = (getHeaderTitle) eWalletMotionConnectActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) eWalletMotionConnectActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = f489a + 89;
            d = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = null;
        }
        if (str == null) {
            int i6 = d + 61;
            f489a = i6 % 128;
            int i7 = i6 % 2;
            str = "";
        }
        String string = Settings.Secure.getString(eWalletMotionConnectActivity.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        MotionLinkingRequest motionLinkingRequest = new MotionLinkingRequest(str, string);
        Intrinsics.checkNotNullParameter(motionLinkingRequest, "");
        MutableLiveData<VirtualCameraAdapter1<MotionLinkingResponse>> mutableLiveData = getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(motionLinkingRequest)));
        if (derivecodecB != null) {
            final Function1 function1 = new Function1() { // from class: isDispatchingItemsChanged
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getHeaderTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getheadertitle, (MotionLinkingResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: isShortcutKey
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: hasVisibleItems
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getHeaderTitle.b(getheadertitle, (Throwable) obj);
                }
            };
            getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isShortcutsVisible
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(EWalletMotionConnectActivity eWalletMotionConnectActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MaterialButton materialButton = ((ActivityEwalletConnectBinding) ((ViewBinding) eWalletMotionConnectActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actEwconnectConnect;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setEnabled(false);
            eWalletMotionConnectActivity.MediaBrowserCompat();
            str = "loading_linking_motionpay_webview";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = d + 101;
            f489a = i2 % 128;
            int i3 = i2 % 2;
            eWalletMotionConnectActivity.IconCompatParcelizer();
            MaterialButton materialButton2 = ((ActivityEwalletConnectBinding) ((ViewBinding) eWalletMotionConnectActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actEwconnectConnect;
            Intrinsics.checkNotNullExpressionValue(materialButton2, "");
            materialButton2.setEnabled(true);
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String upperCase = ((MotionLinkingResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMsgCode().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (Intrinsics.areEqual(upperCase, "SUCCESS")) {
                eWalletMotionConnectActivity.finish();
                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(eWalletMotionConnectActivity, ((MotionLinkingResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getUrl(), "", 251, null, false, 48);
            }
            int i4 = d + 59;
            f489a = i4 % 128;
            int i5 = i4 % 2;
            str = "success_linking_motionpay_webview";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = d + 125;
            f489a = i6 % 128;
            int i7 = i6 % 2;
            eWalletMotionConnectActivity.IconCompatParcelizer();
            MaterialButton materialButton3 = ((ActivityEwalletConnectBinding) ((ViewBinding) eWalletMotionConnectActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actEwconnectConnect;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            materialButton3.setEnabled(true);
            getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = eWalletMotionConnectActivity.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_error_process, "", strValueOf, string, null, 112);
            FragmentManager supportFragmentManager = eWalletMotionConnectActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = "failed_linking_motionpay_webview";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_ewallet_motion_connect", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(EWalletMotionConnectActivity eWalletMotionConnectActivity, View view) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(new Object[]{eWalletMotionConnectActivity, view}, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1890828837, -1890828837);
    }

    static {
        g = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asInterface + 7;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityEwalletConnectBinding> TuitionPaymentFragmentbindingInflater1() {
        return (Function1) TuitionPaymentFragmentbindingInflater1(new Object[]{this}, ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1628130704, ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1650369934, -1650369933);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f489a + 13;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = i3 + 65;
        f489a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return R.layout.activity_ewallet_connect;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 1812380077, ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1453402826 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_mask_text).substring(0, 6).codePointAt(2), ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1423738046, 1423738048);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 9;
        f489a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 9;
        f489a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 39;
        f489a = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        b = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        asBinder = (char) 19465;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f489a + 21;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.ewallet.EWalletMotionConnectActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r8 = 104 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.ewallet.EWalletMotionConnectActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
