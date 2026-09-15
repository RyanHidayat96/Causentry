package com.bpjstku.presentation.support;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivitySupportBinding;
import com.bpjstku.presentation.support.SupportActivity;
import com.bpjstku.presentation.support.model.SupportMenu;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addCaptureCallback;
import defpackage.attachPreviewSurface;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMaxImages;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0015\u0010\u0012\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/support/SupportActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySupportBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LgetStreamUseCaseSupportedCombinationList;", "Lkotlin/Lazy;", "LCameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportActivity extends BindingBaseActivity<ActivitySupportBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f636a;
    private static int asInterface;
    private static long b;
    private static int cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.activity_support;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: lambdaonCaptureStarted0androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SupportActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private static final byte[] $$c = {42, -104, -68, 105};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, 116, 92, -78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 111;
    private static int g = 0;
    private static int asBinder = 0;
    private static int d = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 1
            int r6 = 145 - r6
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = com.bpjstku.presentation.support.SupportActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.support.SupportActivity.c(short, int, short, java.lang.Object[]):void");
    }

    public SupportActivity() {
        final SupportActivity supportActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.support.SupportActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = supportActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
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

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SupportActivity supportActivity) {
        int i = 2 % 2;
        int i2 = d + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = ((getStreamUseCaseSupportedCombinationList) supportActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
        if (string.length() > 0) {
            int i4 = d + 121;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(supportActivity, string, "Informasi dan Pengaduan", 0, null, false, 36);
                return;
            } else {
                WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(supportActivity, string, "Informasi dan Pengaduan", 0, null, false, 56);
                return;
            }
        }
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Sedang memuat informasi antrian online...", 0).show();
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.support.SupportActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/support/SupportActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SupportActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 7;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i6 = i3 + 111;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySupportBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SupportActivity$bindingInflater$1 supportActivity$bindingInflater$1 = SupportActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = d + 117;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return supportActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        SupportActivity supportActivity = this;
        Intrinsics.checkNotNullParameter(supportActivity, "");
        supportActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivitySupportBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivitySupportBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.label_help_center));
        RecyclerView recyclerView = ((ActivitySupportBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvSupport;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "Antrian Online", 0, false, 6, (Object) null);
        spannableString.setSpan(new TuitionPaymentFragmentbindingInflater1(), iIndexOf$default, iIndexOf$default + 14, 33);
        ((ActivitySupportBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAntrianOnlineInfo.setText(spannableString);
        ((ActivitySupportBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAntrianOnlineInfo.setMovementMethod(LinkMovementMethod.getInstance());
        int i2 = asBinder + 25;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends ClickableSpan {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            SupportActivity.TuitionPaymentFragmentbindingInflater1(SupportActivity.this);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(SupportActivity.this, android.R.color.white));
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
            int i4 = $10 + 67;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - View.resolveSize(0, 0)), ExpandableListView.getPackedPositionType(0L) + 1235, TextUtils.lastIndexOf("", '0', 0, 0) + 36, -653973969, false, $$i(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 2764, 14 - KeyEvent.normalizeMetaState(0), 1504416861, false, $$i(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 253, 22 - (Process.myTid() >> 22), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - TextUtils.getOffsetAfter("", 0)), 2891 - View.getDefaultSize(0, 0), 17 - (ViewConfiguration.getEdgeSlop() >> 16), 2012627446, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) asInterface) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) f636a) ^ (-6377398940819159759L)))));
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
        int i6 = $11 + 13;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            Object obj = null;
            if (p0.getItemId() == 16908332) {
                int i2 = asBinder + 27;
                d = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = d + 119;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = asBinder + 9;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = asBinder + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
            int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 141, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, maxKeyCode, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{21600, 788, 58782, 4701}, (char) ((-1) - MotionEvent.axisFromString("")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).length() - 1, new char[]{13957, 59678, 23098, 321, 47768, 28530, 8249, 5894, 1490, 34378, 61453, 43104, 46663, 31524, 57898, 7592, 44602, 15137, 19848, 62585, 56532, 4787}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{43119, 48265, 2184, 9353}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 35034), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 2000910021, new char[]{3561, 33868, 62341, 44202, 21259, 41301, 42403, 6615, 12900, 10990, 51699, 28758, 135, 20320, 14314}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int iRed = Color.red(0) + 1031;
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
            Object[] objArr5 = new Object[1];
            c((byte) 52, (short) 89, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iRed, capsMode, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int iAlpha = Color.alpha(0) + 15;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b2, (short) (b2 | 37), bArr[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iResolveSizeAndState, iAlpha, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1033539017;
            int i7 = (((((~((-173639754) | length)) | 172492873) * (-566)) - 909001521) + ((~(length | (-1146881))) * 566)) - 839591701;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{52298, 11660, 24659, 40542}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 24062), TextUtils.indexOf("", "", 0, 0), new char[]{9493, 6575, 45335, 3944, 16584, 57817, 34112, 5482, 36275, 32034, 7438, 782, 5501, 52847, 6721, 5352}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{56625, 54262, 36372, 25692}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 23658), Color.argb(0, 0, 0, 0), new char[]{61610, 44095, 24082, 40159, 17884, 2908, 47290, 52266, 12801, 60514, 13686, 18580, 65088, 30508, 55997, 53707}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1062659329};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.blue(0) + 46038), TextUtils.indexOf("", "", 0) + 1134, ImageFormat.getBitsPerPixel(0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -839591701, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                    int gidForName = 14 - Process.getGidForName("");
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, (short) 141, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, packedPositionChild, gidForName, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getSize(0) + 45993), Color.alpha(0) + 1117, View.resolveSizeAndState(0, 0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
                    int i10 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    c(b3, (short) (b3 | 37), bArr2[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, iCombineMeasuredStates, i10, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{21600, 788, 58782, 4701}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step4).substring(26, 27).codePointAt(0) - 111, new char[]{13957, 59678, 23098, 321, 47768, 28530, 8249, 5894, 1490, 34378, 61453, 43104, 46663, 31524, 57898, 7592, 44602, 15137, 19848, 62585, 56532, 4787}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{43119, 48265, 2184, 9353}, (char) (35080 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2000909948, new char[]{3561, 33868, 62341, 44202, 21259, 41301, 42403, 6615, 12900, 10990, 51699, 28758, 135, 20320, 14314}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int gidForName2 = Process.getGidForName("") + 1032;
                        int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, (short) 89, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, gidForName2, scrollBarFadeDuration, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                        int defaultSize = View.getDefaultSize(0, 0) + 15;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, (short) 141, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(fadingEdgeLength, i11, defaultSize, 1357589585, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = asBinder + 11;
            d = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i19 = ~startElapsedRealtime;
            int i20 = i16 + (-833981599) + ((startElapsedRealtime | 206438545) * 988) + (((~(745452797 | i19)) | (-1040186880)) * (-1976)) + (((~(startElapsedRealtime | 501172627)) | 206438545 | (~((-501172628) | i19))) * 988);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
                int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                byte b4 = (byte) ($$b & 181);
                Object[] objArr19 = new Object[1];
                c(b4, b4, $$a[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mirror, windowTouchSlop, offsetAfter, 986134021, false, (String) objArr19[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cRgb2 = (char) ((-16747272) - Color.rgb(0, 0, 0));
                    int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    Object[] objArr20 = new Object[1];
                    c((byte) 52, (short) 89, $$a[7], objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cRgb2, iLastIndexOf, tapTimeout, 1599039318, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
                int i23 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
                int i24 = ~i23;
                int i25 = ((((-144688828) + (((~((-623329635) | i24)) | (~(410727208 | i24))) * (-867))) + ((((~((-623329635) | i23)) | 621035586) | (~(410727208 | i23))) * (-1734))) + (((~(i23 | 1031762794)) | ((~(i24 | (-621035587))) | (~((-2294049) | i23)))) * 867)) - 89014841;
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i27 ^ (i27 << 5);
            } else {
                Object[] objArr22 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{52298, 11660, 24659, 40542}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 24124), Gravity.getAbsoluteGravity(0, 0), new char[]{9493, 6575, 45335, 3944, 16584, 57817, 34112, 5482, 36275, 32034, 7438, 782, 5501, 52847, 6721, 5352}, objArr22);
                Class<?> cls4 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{56625, 54262, 36372, 25692}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_permata).substring(1, 3).length() + 23692), (Process.getThreadPriority(0) + 20) >> 6, new char[]{61610, 44095, 24082, 40159, 17884, 2908, 47290, 52266, 12801, 60514, 13686, 18580, 65088, 30508, 55997, 53707}, objArr23);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr24 = {1062659329};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 1726, TextUtils.lastIndexOf("", '0', 0, 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -89014841);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "") + 23;
                    Object[] objArr25 = new Object[1];
                    c((byte) 52, (short) 89, $$a[7], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, jumpTapTimeout, iIndexOf, 1599039318, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr26 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{21600, 788, 58782, 4701}, (char) View.combineMeasuredStates(0, 0), ViewConfiguration.getScrollBarSize() >> 8, new char[]{13957, 59678, 23098, 321, 47768, 28530, 8249, 5894, 1490, 34378, 61453, 43104, 46663, 31524, 57898, 7592, 44602, 15137, 19848, 62585, 56532, 4787}, objArr26);
                    Class<?> cls5 = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{43119, 48265, 2184, 9353}, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 35080), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unable_to_parse_information).substring(0, 31).codePointAt(24) - 2000910026, new char[]{3561, 33868, 62341, 44202, 21259, 41301, 42403, 6615, 12900, 10990, 51699, 28758, 135, 20320, 14314}, objArr27);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int scrollBarFadeDuration2 = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iCombineMeasuredStates2 = 23 - View.combineMeasuredStates(0, 0);
                        short s = $$a[7];
                        Object[] objArr28 = new Object[1];
                        c((byte) 52, s, (byte) s, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, scrollBarFadeDuration2, iCombineMeasuredStates2, 1596667560, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                        int i28 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int offsetAfter2 = 23 - TextUtils.getOffsetAfter("", 0);
                        byte b5 = (byte) ($$b & 181);
                        Object[] objArr29 = new Object[1];
                        c(b5, b5, $$a[7], objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAxisFromString, i28, offsetAfter2, 986134021, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
            int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
            if (i30 == i29) {
                int i31 = d + 103;
                asBinder = i31 % 128;
                int i32 = i31 % 2;
                int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
                Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i34 = ~iIdentityHashCode;
                int i35 = i33 + (-144688828) + (((~((-49799717) | i34)) | (~((-162802710) | i34))) * (-867)) + (((~((-49799717) | iIdentityHashCode)) | 11804676 | (~((-162802710) | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | (-150998034))) | (~(i34 | (-11804677))) | (~((-37995041) | iIdentityHashCode))) * 867);
                int i36 = (i35 << 13) ^ i35;
                int i37 = i36 ^ (i36 >>> 17);
                ((int[]) objArr30[3])[0] = i37 ^ (i37 << 5);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
            int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i39 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i40 = ~(446767253 | i39);
            int i41 = i38 + (-733028347) + ((i40 | (-234164828)) * 764) + (((~(i39 | (-234164828))) | 144769041) * (-1528)) + (((-391393999) | i40) * 764);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        throw new RuntimeException(String.valueOf(i13));
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -940920543
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
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.support.SupportActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -435843175
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.support.SupportActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bb, code lost:
    
        if (r0 != ((708222385 + ((~((-303437913) | r3)) * (-783))) + (((~(r3 | 1709287170)) | (-869768795)) * 783))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bd, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.support.SupportActivity.asBinder + 119;
        com.bpjstku.presentation.support.SupportActivity.d = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c9, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cb, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cd, code lost:
    
        r11 = (-823451960) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        r11 = (-75078866) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e0, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
    
        if (r3 == ((r8 + ((r7 | (~(2142236635 | r5))) * 50)) + (((~(r5 | 724413123)) | ((~(1554400666 | r5)) | (-2142236636))) * 50))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008e, code lost:
    
        if (r3 == (((1495566632 + (((~(r6 | 633484852)) | ((~(1463472395 | r6)) | (-2012936000))) * 464)) + (((-549463605) | r5) * (-464))) + (((~(r5 | 633484852)) | (-2012936000)) * 464))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.support.SupportActivity.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i;
        SupportActivity supportActivity = (SupportActivity) objArr[0];
        SupportMenu supportMenu = (SupportMenu) objArr[1];
        int i2 = 2 % 2;
        int i3 = asBinder + 93;
        d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(supportMenu, "");
        if (i4 == 0) {
            Intrinsics.areEqual(supportMenu.TuitionPaymentFragmentbindingInflater1, "1");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = supportMenu.TuitionPaymentFragmentbindingInflater1;
        if (!Intrinsics.areEqual(str, "1")) {
            if (Intrinsics.areEqual(str, ExifInterface.GPS_MEASUREMENT_2D)) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", "view_contact_center"));
                Intrinsics.checkNotNullParameter(supportActivity, "");
                Intrinsics.checkNotNullParameter("view_contact_center", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("view_contact_center", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_contact_center", mapMutableMapOf);
                ContactCenterActivity.Companion companion = ContactCenterActivity.INSTANCE;
                ContactCenterActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(supportActivity);
                i = asBinder + 113;
                d = i % 128;
            }
            return Unit.INSTANCE;
        }
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("menu_name", "view_faq"));
        Intrinsics.checkNotNullParameter(supportActivity, "");
        Intrinsics.checkNotNullParameter("view_faq", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_faq", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_faq", mapMutableMapOf2);
        SupportActivity supportActivity2 = supportActivity;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String str2 = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -1177308920, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1177308920);
        Intrinsics.checkNotNullParameter(supportActivity2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        WebviewFaqCustomActivity.Companion companion2 = WebviewFaqCustomActivity.INSTANCE;
        WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(supportActivity2, str2, "");
        i = d + 53;
        asBinder = i % 128;
        int i5 = i % 2;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2(final SupportActivity supportActivity) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        String string = supportActivity.getString(R.string.title_faq);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = supportActivity.getString(R.string.label_faq_description);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        arrayList.add(new SupportMenu("1", string, string2, R.drawable.ic_faq_new));
        String string3 = supportActivity.getString(R.string.label_title_community_service);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = supportActivity.getString(R.string.label_community_service_desc);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList.add(new SupportMenu(ExifInterface.GPS_MEASUREMENT_2D, string3, string4, R.drawable.ic_contact_center));
        CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 = new CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0(supportActivity, arrayList, new Function1() { // from class: CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (SupportMenu) obj};
                return (Unit) SupportActivity.b(attachPreviewSurface.b(), attachPreviewSurface.b(), attachPreviewSurface.b(), objArr, attachPreviewSurface.b(), 1555158984, -1555158982);
            }
        });
        int i2 = d + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i5)) | (~(i6 | i5));
        int i9 = i6 | i3;
        int i10 = (~(i3 | (~i5))) | (~(i7 | (~i6))) | (~i9);
        int i11 = i6 + i5 + i4 + (1350191703 * i) + ((-44904237) * i2);
        int i12 = i11 * i11;
        int i13 = ((i6 * (-560584373)) - 948043776) + ((-560584373) * i5) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i4) + ((-71041024) * i) + ((-766246912) * i2) + (1339949056 * i12);
        int i14 = (i6 * 1657715387) + 2046152777 + (i5 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i4 * 1657716305) + (i * 1507858311) + (i2 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        int i16 = 2 % 2;
        int i17 = d + 39;
        asBinder = i17 % 128;
        int i18 = i17 % 2;
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(SupportActivity supportActivity, SupportMenu supportMenu) {
        int iB = attachPreviewSurface.b();
        int iB2 = attachPreviewSurface.b();
        return (Unit) b(attachPreviewSurface.b(), attachPreviewSurface.b(), iB, new Object[]{supportActivity, supportMenu}, iB2, 1555158984, -1555158982);
    }

    static {
        cancelAll = 1;
        g();
        INSTANCE = new Companion(null);
        int i = g + 49;
        cancelAll = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = d + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = addCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iB = attachPreviewSurface.b();
        b(attachPreviewSurface.b(), attachPreviewSurface.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iB, 880940943, -880940943);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = addCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(attachPreviewSurface.b(), 483550612 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_qr_code).substring(1, 2).codePointAt(0), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, bundle}, 1727713096 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_alto).substring(1, 3).codePointAt(1), 1918107934, -1918107933);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = d + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        b = -6377398940819159759L;
        asInterface = -981105359;
        f636a = (char) 7306;
    }

    private static String $$i(byte b2, int i, byte b3) {
        byte[] bArr = $$c;
        int i2 = 104 - b3;
        int i3 = i * 3;
        int i4 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = i4 + i2;
            i4++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i2;
            i6 = i7;
            i2 = bArr[i4] + i8;
            i4++;
        }
    }
}
