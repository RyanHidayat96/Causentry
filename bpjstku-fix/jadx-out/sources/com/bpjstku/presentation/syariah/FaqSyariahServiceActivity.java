package com.bpjstku.presentation.syariah;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.databinding.ActivityFaqSyariahServiceBinding;
import com.bpjstku.presentation.syariah.model.FaqSyariahModel;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.ConstantObservable;
import defpackage.DecorContentParent;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.checkPreconditions;
import defpackage.createCaptureSession;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0015\u0010\u0015\u001a\u00020\u00138BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/syariah/FaqSyariahServiceActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityFaqSyariahServiceBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "Lcom/bpjstku/presentation/syariah/model/FaqSyariahModel;", "Ljava/util/List;", "LcreateCaptureSession;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FaqSyariahServiceActivity extends BindingBaseActivity<ActivityFaqSyariahServiceBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f637a;
    private List<FaqSyariahModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {81, 125, 2, 46};
    private static final int $$f = 66;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 171;
    private static int d = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.$$a
            int r6 = r6 + 4
            int r1 = 53 - r8
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    public FaqSyariahServiceActivity() {
        final FaqSyariahServiceActivity faqSyariahServiceActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<createCaptureSession>() { // from class: com.bpjstku.presentation.syariah.FaqSyariahServiceActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, createCaptureSession] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ createCaptureSession invoke() {
                LifecycleOwner lifecycleOwner = faqSyariahServiceActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(createCaptureSession.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.syariah.FaqSyariahServiceActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/syariah/FaqSyariahServiceActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "Lcom/bpjstku/presentation/syariah/model/FaqSyariahModel;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, List<FaqSyariahModel> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, FaqSyariahServiceActivity.class, new Pair[]{TuplesKt.to("faq_syariah", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityFaqSyariahServiceBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        FaqSyariahServiceActivity$bindingInflater$1 faqSyariahServiceActivity$bindingInflater$1 = FaqSyariahServiceActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = asInterface + 81;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return faqSyariahServiceActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        ArrayList arrayListEmptyList;
        int i = 2 % 2;
        int i2 = asInterface + 9;
        d = i2 % 128;
        int i3 = i2 % 2;
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("faq_syariah");
        if (parcelableArrayListExtra != null) {
            int i4 = asInterface + 65;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            arrayListEmptyList = parcelableArrayListExtra;
        } else {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayListEmptyList;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        FaqSyariahServiceActivity faqSyariahServiceActivity = (FaqSyariahServiceActivity) objArr[0];
        int i = 2 % 2;
        FaqSyariahServiceActivity faqSyariahServiceActivity2 = faqSyariahServiceActivity;
        List<FaqSyariahModel> list = faqSyariahServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (list == null) {
            int i2 = d + 91;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        checkPreconditions checkpreconditions = new checkPreconditions(faqSyariahServiceActivity2, list);
        RecyclerView recyclerView = ((ActivityFaqSyariahServiceBinding) ((ViewBinding) faqSyariahServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvListFaq;
        recyclerView.setLayoutManager(new LinearLayoutManager(faqSyariahServiceActivity2));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(checkpreconditions);
        int i3 = d + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        int i3 = 4;
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i4 = $10 + 47;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
            int i6 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 1356, 38 - (KeyEvent.getMaxKeyCode() >> 16), 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "", 0, 0) + 468, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i7 = $10 + 41;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 3;
                }
                i3 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = d + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        FaqSyariahServiceActivity faqSyariahServiceActivity = this;
        Intrinsics.checkNotNullParameter(faqSyariahServiceActivity, "");
        faqSyariahServiceActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((ActivityFaqSyariahServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, "FAQ Layanan Syariah", true);
        int i4 = asInterface + 77;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            Object obj = null;
            if (p0.getItemId() == 16908332) {
                int i2 = asInterface + 55;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = d + 85;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
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
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
            int iRed = Color.red(0) + 1755;
            int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr = $$a;
            short s = bArr[7];
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 14), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iRed, offsetAfter, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                int iRed2 = 1755 - Color.red(0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c((short) 37, bArr2[5], bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iRed2, touchSlop, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i3 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{i3}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i4 = ~startElapsedRealtime;
            int i5 = (((((~(i4 | (-615899292))) | ((~((-828501718) | i4)) | 539091089)) * (-397)) - 1156612199) + ((startElapsedRealtime | (-366218831)) * 397)) - 2049388016;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i7 ^ (i7 << 5);
            int i8 = d + 111;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{23369, 23331, 28916, 31856, 33801, 40373, 36346, 43828, 26867, 12513, 53386, 55255, 15366, 1239, 7444, 'T', 49542, 55073, 10582, 19708}, 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{23212, 23237, 9502, 10655, 51410, 53629, 17803, 25418, 26956, 25870, 40023, 8113, 15820, 20850, 20988, 51252, 49235, 33488, 26015, 33925}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1051).substring(0, 32).length() - 31, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1238102422};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 42049), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1726, TextUtils.getOffsetBefore("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -2049388016);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                    int iArgb = Color.argb(0, 0, 0, 0) + 23;
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c((short) 37, bArr3[5], bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, iIndexOf, iArgb, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{2312, 2409, 2904, 2003, 16466, 23036, 64471, 56586, 15091, 19272, 5318, 41402, 28239, 32550, 55584, 30291, 37837, 44170, 60686, 15065, 50997, 53294, 45450, 3911, 2191, 1530}, TextUtils.indexOf("", "") + 1, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{47134, 47227, 11924, 8733, 26460, 32503, 45432, 38823, 35833, 28296, 13261, 60265, 57171, 23288, 65129, 15579, 8907, 35160, 51732}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
                        int i10 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int gidForName = Process.getGidForName("") + 24;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        c((short) 89, bArr4[5], bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i10, gidForName, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                        int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                        int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
                        byte[] bArr5 = $$a;
                        short s2 = bArr5[7];
                        byte b2 = bArr5[5];
                        Object[] objArr12 = new Object[1];
                        c(s2, b2, (byte) (b2 | 14), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, i11, iKeyCodeFromString, 986134021, false, (String) objArr12[0], null);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i14 = asInterface + 21;
                    d = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i16 = d + 41;
        asInterface = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i19}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i21 = 498213659 + (((~((-113503381) | i20)) | (-99099046)) * (-318));
        int i22 = ~((-99099046) | i20);
        int i23 = ~i20;
        int i24 = i18 + i21 + ((i22 | (~(132902325 | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i20 | 132902325)) | (~((-19398946) | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr13[3])[0] = i26 ^ (i26 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
            byte[] bArr6 = $$a;
            Object[] objArr14 = new Object[1];
            c((short) 141, bArr6[5], bArr6[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyPid, longPressTimeout, jumpTapTimeout, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{2312, 2409, 2904, 2003, 16466, 23036, 64471, 56586, 15091, 19272, 5318, 41402, 28239, 32550, 55584, 30291, 37837, 44170, 60686, 15065, 50997, 53294, 45450, 3911, 2191, 1530}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{47134, 47227, 11924, 8733, 26460, 32503, 45432, 38823, 35833, 28296, 13261, 60265, 57171, 23288, 65129, 15579, 8907, 35160, 51732}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
            int i27 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
            byte[] bArr7 = $$a;
            Object[] objArr17 = new Object[1];
            c((short) 37, bArr7[5], bArr7[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, edgeSlop, i27, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                int iArgb2 = Color.argb(0, 0, 0, 0) + 15;
                byte b3 = $$a[7];
                Object[] objArr18 = new Object[1];
                c((short) 193, b3, (byte) (b3 | 52), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, longPressTimeout2, iArgb2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr19[3])[0];
            int i29 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = 673654817 + (((~((-121020646) | iIdentityHashCode)) | 123259524) * (-366)) + (((~(iIdentityHashCode | (-2498658))) | 4737536) * 366) + 1974572306;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[2])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{23369, 23331, 28916, 31856, 33801, 40373, 36346, 43828, 26867, 12513, 53386, 55255, 15366, 1239, 7444, 'T', 49542, 55073, 10582, 19708}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_instalments).substring(4, 5).length(), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{23212, 23237, 9502, 10655, 51410, 53629, 17803, 25418, 26956, 25870, 40023, 8113, 15820, 20850, 20988, 51252, 49235, 33488, 26015, 33925}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1238102422};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46038), View.resolveSizeAndState(0, 0, 0) + 1134, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1974572306, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cRed = (char) Color.red(0);
                int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                int size = View.MeasureSpec.getSize(0) + 15;
                byte[] bArr8 = $$a;
                Object[] objArr24 = new Object[1];
                c((short) 141, bArr8[5], bArr8[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cRed, longPressTimeout3, size, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0) + 45993), 1117 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b4 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 193, b4, (byte) (b4 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, fadingEdgeLength, scrollBarFadeDuration, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{2312, 2409, 2904, 2003, 16466, 23036, 64471, 56586, 15091, 19272, 5318, 41402, 28239, 32550, 55584, 30291, 37837, 44170, 60686, 15065, 50997, 53294, 45450, 3911, 2191, 1530}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{47134, 47227, 11924, 8733, 26460, 32503, 45432, 38823, 35833, 28296, 13261, 60265, 57171, 23288, 65129, 15579, 8907, 35160, 51732}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 106, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                    int iAlpha = 15 - Color.alpha(0);
                    byte[] bArr9 = $$a;
                    Object[] objArr28 = new Object[1];
                    c((short) 37, bArr9[5], bArr9[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, scrollDefaultDelay, iAlpha, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iRed3 = Color.red(0) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((short) 141, bArr10[5], bArr10[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAxisFromString, iIndexOf2, iRed3, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i33 = asInterface + 7;
                d = i33 % 128;
                int i34 = i33 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    int i35 = d + 87;
                    asInterface = i35 % 128;
                    int i36 = i35 % 2;
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i37 = d + 55;
        asInterface = i37 % 128;
        int i38 = i37 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i39 = ((int[]) objArr[2])[0];
        int i40 = ((int[]) objArr[3])[0];
        int i41 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iNextInt = new Random().nextInt(965460594);
        int i42 = i39 + (-1909222411) + (((~(iNextInt | 61134450)) | (-183145720)) * (-668)) + ((61134450 | (~((-183145720) | iNextInt))) * 1336) + ((iNextInt | (-139067526)) * 668);
        int i43 = i42 ^ (i42 << 13);
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr30[2])[0] = i44 ^ (i44 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1115665085
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
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~System.identityHashCode(this);
        if (i4 != 2082379160 + ((2139680511 | i5) * 184) + (((~(i5 | 763898916)) | 1921575647) * 184)) {
            throw null;
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
        int i8 = ~i7;
        if (i6 != 234842492 + (((~((-2008094276) | i8)) | 287314432) * 184) + ((i7 | (-2012962788)) * (-184)) + ((~((-292182945) | i8)) * 184)) {
            throw null;
        }
        super.onStart();
        int i9 = asInterface + 79;
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c9, code lost:
    
        if (r1 != ((((1083179040 | r2) * (-970)) - 769050000) + ((r2 | 604000350) * 970))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cb, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.d + 5;
        com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.asInterface = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00da, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00dd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00de, code lost:
    
        r10 = 1321434306 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ef, code lost:
    
        throw new java.lang.RuntimeException("-1065730815");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r1 == (((41940604 + ((r5 | (~((-1384161289) | r6))) * (-406))) + ((~(2078861117 | r6)) * (-406))) + (((~(r4 | (-694699830))) | (~((-1524687373) | r6))) * 406))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009d, code lost:
    
        if (r1 == ((((-1338023470) + ((r5 | (~((-1116359393) | r4))) * 886)) + (((~(r4 | (-1858752245))) | 1028764701) * (-1772))) + ((~(r4 | 1028764701)) * 886))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = ~((~new java.util.Random().nextInt()) | 1687179390);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i2) | i3 | i5);
        int i8 = ~((~i3) | i2);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i2));
        int i11 = ~(i9 | i3);
        int i12 = i2 + i3 + i6 + ((-1568348280) * i4) + (1617068012 * i);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i2) - 739508224) + (1544986862 * i3) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i6) + ((-1885339648) * i4) + (1743781888 * i) + (858456064 * i13);
        int i15 = (i2 * (-973781596)) + 539565670 + (i3 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i6 * (-973780651)) + (i4 * 424585256) + (i * 537576796) + (i13 * 1078394880);
        if (i14 + (i15 * i15 * 192741376) == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i16 = 2 % 2;
        int i17 = asInterface + 71;
        int i18 = i17 % 128;
        d = i18;
        int i19 = i17 % 2;
        int i20 = i18 + 9;
        asInterface = i20 % 128;
        int i21 = i20 % 2;
        return Integer.valueOf(R.layout.activity_faq_syariah_service);
    }

    static {
        f637a = 1;
        g();
        INSTANCE = new Companion(null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        f637a = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iCodePointAt = 403200415 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).codePointAt(8);
        int iB = ScholarshipHistoryRequest.b();
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 1504839090;
        return ((Integer) TuitionPaymentFragmentbindingInflater1(ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), 80380484, -80380484, new Object[]{this}, iCodePointAt2, iCodePointAt, iB)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = d + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = d + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.empty_transaction_response).substring(0, 1).length() + 1879395396;
        int iTuitionPaymentFragmentbindingInflater1 = ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(ScholarshipHistoryRequest.b(), 999042919, -999042918, new Object[]{this}, iTuitionPaymentFragmentbindingInflater2, length, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 89;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6127836489405962621L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.$$c
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r7 = r7 + 107
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.FaqSyariahServiceActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
