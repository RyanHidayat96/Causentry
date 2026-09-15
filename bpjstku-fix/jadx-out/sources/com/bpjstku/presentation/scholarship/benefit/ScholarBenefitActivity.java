package com.bpjstku.presentation.scholarship.benefit;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.view.OnBackPressedCallback;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityScholarBenefitBinding;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.generateUltraHdrSupportedCombinationList;
import defpackage.getEventTime;
import defpackage.getOpeningBlocker;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isRawSupported;
import defpackage.lambdagetPreviewBitmap1;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u0015\u0010\u0006\u001a\u00020\u00178GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0015\u0010\u001a\u001a\u00020\u00198GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/scholarship/benefit/ScholarBenefitActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityScholarBenefitBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LgenerateUltraHdrSupportedCombinationList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarBenefitActivity extends BindingBaseActivity<ActivityScholarBenefitBinding> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int g;
    public final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$a = {114, -59, 10, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 219;
    private static int d = 1;
    private static int b = 0;
    private static int asInterface = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = ~(i7 | i2);
        int i10 = i8 | i9;
        int i11 = ~i3;
        int i12 = (~((~i2) | i7 | i3)) | (~(i7 | i11 | i2));
        int i13 = i9 | (~(i11 | i));
        int i14 = i + i3 + i5 + ((-1696018712) * i4) + (2108813197 * i6);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i) - 2121662464) + (1221732374 * i3) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i5) + (39845888 * i4) + (227278848 * i6) + ((-1705377792) * i15);
        int i17 = ((i * 362004572) - 1408384217) + (i3 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i5 * 362004373) + (i4 * (-1290304248)) + (i6 * 155295761) + (i15 * (-60686336));
        if (i16 + (i17 * i17 * (-1680474112)) == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        ScholarBenefitActivity scholarBenefitActivity = (ScholarBenefitActivity) objArr[0];
        int i18 = 2 % 2;
        ScholarBenefitActivity scholarBenefitActivity2 = scholarBenefitActivity;
        Intrinsics.checkNotNullParameter(scholarBenefitActivity2, "");
        scholarBenefitActivity2.getWindow().addFlags(8192);
        scholarBenefitActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityScholarBenefitBinding) ((ViewBinding) scholarBenefitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityScholarBenefitBinding) ((ViewBinding) scholarBenefitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(scholarBenefitActivity.getString(R.string.title_scholarship_benefit));
        scholarBenefitActivity.getOnBackPressedDispatcher().addCallback(scholarBenefitActivity, scholarBenefitActivity.new TuitionPaymentFragmentbindingInflater1());
        int i19 = asInterface + 103;
        b = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    private static void c(short s, short s2, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i = 145 - s;
        int i2 = (b2 * 14) + 84;
        byte[] bArr2 = new byte[53 - s2];
        int i3 = 52 - s2;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (i2 + i) - 11;
            i++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            int i7 = i + 1;
            i4 = i5;
            i2 = (i6 + bArr[i]) - 11;
            i = i7;
        }
    }

    public ScholarBenefitActivity() {
        final ScholarBenefitActivity scholarBenefitActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = scholarBenefitActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final ScholarBenefitActivity scholarBenefitActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<generateUltraHdrSupportedCombinationList>() { // from class: com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, generateUltraHdrSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ generateUltraHdrSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = scholarBenefitActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(generateUltraHdrSupportedCombinationList.class);
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

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityScholarBenefitBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = b + 55;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            ScholarBenefitActivity$bindingInflater$1 scholarBenefitActivity$bindingInflater$1 = ScholarBenefitActivity$bindingInflater$1.b;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScholarBenefitActivity$bindingInflater$1 scholarBenefitActivity$bindingInflater$2 = ScholarBenefitActivity$bindingInflater$1.b;
        int i3 = b + 43;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return scholarBenefitActivity$bindingInflater$2;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/scholarship/benefit/ScholarBenefitActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;", "p1", "", "Ljava/io/File;", "p2", "Landroid/content/Intent;", "b", "(Landroid/content/Context;Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;Ljava/util/List;)Landroid/content/Intent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent b(Context p0, ScholarPersonDetail p1, List<File> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ScholarBenefitActivity.class);
            intent.putExtra("scholar_info", p1);
            if (p2 != null) {
                List<File> list = p2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((File) it.next()).getAbsolutePath());
                }
                intent.putStringArrayListExtra("scholar_photo_liveness", new ArrayList<>(arrayList));
            }
            return intent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityScholarBenefitBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).sbRegisterProgression.setOnTouchListener(new View.OnTouchListener() { // from class: generateUltraHighSupportedCombinationList
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ScholarBenefitActivity.g();
            }
        });
        int i2 = asInterface + 37;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        ((generateUltraHdrSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).asBinder.setValue((ScholarPersonDetail) getIntent().getParcelableExtra("scholar_info"));
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("scholar_photo_liveness");
        if (stringArrayListExtra != null) {
            ArrayList<String> arrayList2 = stringArrayListExtra;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator<T> it = arrayList2.iterator();
            int i2 = b + 63;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                arrayList3.add(new File((String) it.next()));
                int i4 = b + 69;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            arrayList.addAll(arrayList3);
        }
        ((generateUltraHdrSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).INotificationSideChannelStubProxy.setValue(arrayList);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((generateUltraHdrSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getAllPossibleSizeArrangements
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScholarBenefitActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (Integer) obj);
            }
        }));
        int i2 = b + 5;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x01fe  */
    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 87;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i5 = $10 + 1;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 2624, TextUtils.lastIndexOf("", '0', 0, 0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (TuitionPaymentFragmentbindingInflater1 % 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 39423), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 481, 37 - (ViewConfiguration.getScrollBarSize() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 19472), 2624 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getTouchSlop() >> 8) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + UByte.MAX_VALUE), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 481, 37 - (ViewConfiguration.getTouchSlop() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 63;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39421), 481 - KeyEvent.keyCodeFromString(""), 37 - TextUtils.indexOf("", "", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39422 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.indexOf("", "") + 481, (ViewConfiguration.getTouchSlop() >> 8) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends OnBackPressedCallback {
        TuitionPaymentFragmentbindingInflater1() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            Integer value = ((generateUltraHdrSupportedCombinationList) ScholarBenefitActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (value != null) {
                if (value.intValue() <= 1) {
                    ScholarBenefitActivity.this.finish();
                    return;
                }
                MutableLiveData<Integer> mutableLiveData = ((generateUltraHdrSupportedCombinationList) ScholarBenefitActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Integer value2 = ((generateUltraHdrSupportedCombinationList) ScholarBenefitActivity.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                Intrinsics.checkNotNull(value2);
                mutableLiveData.setValue(Integer.valueOf(value2.intValue() - 1));
                return;
            }
            ScholarBenefitActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = b + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = asInterface + 3;
                b = i4 % 128;
                int i5 = i4 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i6 = b + 71;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            Object obj = null;
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
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
            int i2 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, touchSlop, i2, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{33029, 49425, 310, 16711, 33127, 49546, 418, 16887, 33235, 49636, 'D', 16414, 32857, 49224, 'j', 16532, 32953, 49388, 238, 17162, 33563, 49976}, 16411 - View.combineMeasuredStates(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{33025, 57153, 15767, 39887, 63539, 22124, 46262, 4809, 29513, 53652, 12242, 35891, 60001, 18620, 42751}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 24101, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int iAxisFromString = MotionEvent.axisFromString("") + 1032;
            int iRgb = Color.rgb(0, 0, 0) + 16777231;
            short s = (short) ($$b & 381);
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(s, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, iAxisFromString, iRgb, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
                Object[] objArr6 = new Object[1];
                c((short) 37, (byte) 52, $$a[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, touchSlop2, capsMode, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 590972164;
            int i5 = ~length;
            int i6 = ~(358823934 | i5);
            int i7 = ((((-1786072431) + (((-401866751) | i6) * (-712))) + (((~(length | (-43042817))) | (~(i5 | 401866750))) * (-712))) + ((114543764 | i6) * 712)) - 282681777;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{33038, 10904, 54824, 33746, 12094, 56089, 33963, 12353, 56811, 35279, 13589, 56994, 35403, 14313, 58263, 36666}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 43897, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{33037, 31877, 31243, 31109, 30468, 29332, 28686, 28606, 27908, 26792, 26149, 26043, 25371, 24266, 23622, 23498}, (Process.myTid() >> 22) + 64901, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1131121772};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionGroup(0L) + 1134, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -282681777, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((short) 141, b4, b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf, fadingEdgeLength, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.blue(0) + 45993), 1118 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 17 - TextUtils.getCapsMode("", 0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1031;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    Object[] objArr13 = new Object[1];
                    c((short) 37, (byte) 52, $$a[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, capsMode2, minimumFlingVelocity, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{33029, 49425, 310, 16711, 33127, 49546, 418, 16887, 33235, 49636, 'D', 16414, 32857, 49224, 'j', 16532, 32953, 49388, 238, 17162, 33563, 49976}, KeyEvent.normalizeMetaState(0) + 16411, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{33025, 57153, 15767, 39887, 63539, 22124, 46262, 4809, 29513, 53652, 12242, 35891, 60001, 18620, 42751}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 24101, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i10 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                        short s2 = (short) ($$b & 381);
                        byte b5 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(s2, b5, b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(fadingEdgeLength2, i10, trimmedLength, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                        byte b6 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 141, b6, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, modifierMetaStateMask, packedPositionGroup, 1357589585, false, (String) objArr17[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i16 = ~System.identityHashCode(this);
            int i17 = i13 + 644797189 + (((~((-311470105) | i16)) | 555750274) * (-828)) + ((i16 | (-311470105)) * (-828)) + 199208352;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr18[2])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i20 = asInterface + 103;
                    b = i20 % 128;
                    int i21 = i20 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i25 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i26 = i22 + (((~((~i25) | 973075887)) * 130) - 365106625) + (((~(i25 | 973075887)) | 680419589) * 130);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr19[2])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
            byte[] bArr = $$a;
            Object[] objArr20 = new Object[1];
            c((short) 37, (byte) (bArr[33] - 1), bArr[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, doubleTapTimeout, iLastIndexOf, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                short s3 = (short) ($$b & 381);
                byte b7 = $$a[7];
                Object[] objArr21 = new Object[1];
                c(s3, b7, b7, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cKeyCodeFromString, iKeyCodeFromString, jumpTapTimeout, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i30 = (~(106489894 | i29)) | 285480512;
            int i31 = ~((~i29) | (-72878087));
            int i32 = ((1244456889 + ((i30 | i31) * (-470))) + (((~(i29 | 391970406)) | i31) * 470)) - 2076764637;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{33038, 10904, 54824, 33746, 12094, 56089, 33963, 12353, 56811, 35279, 13589, 56994, 35403, 14313, 58263, 36666}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_bni).substring(14, 15).length() + 43932, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{33037, 31877, 31243, 31109, 30468, 29332, 28686, 28606, 27908, 26792, 26149, 26043, 25371, 24266, 23622, 23498}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.page_title_uobapp).substring(0, 12).length() + 64889, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1131121772};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - TextUtils.getCapsMode("", 0, 0)), 1725 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -2076764637, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                int i35 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                short s4 = (short) ($$b & 381);
                byte b8 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(s4, b8, b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(longPressTimeout, i35, iCombineMeasuredStates, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{33029, 49425, 310, 16711, 33127, 49546, 418, 16887, 33235, 49636, 'D', 16414, 32857, 49224, 'j', 16532, 32953, 49388, 238, 17162, 33563, 49976}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).length() + 16407, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{33025, 57153, 15767, 39887, 63539, 22124, 46262, 4809, 29513, 53652, 12242, 35891, 60001, 18620, 42751}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.txt_checkout).substring(0, 15).length() + 24122, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                    int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    short s5 = $$a[7];
                    byte b9 = (byte) s5;
                    Object[] objArr29 = new Object[1];
                    c(s5, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMakeMeasureSpec, iIndexOf2, scrollBarFadeDuration, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                    int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1755;
                    int i36 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                    byte[] bArr2 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) 37, (byte) (bArr2[33] - 1), bArr2[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid, iIndexOf3, i36, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i37 = asInterface + 75;
                b = i37 % 128;
                int i38 = i37 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i39 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i40 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i40 == i39) {
            int i41 = asInterface + 87;
            b = i41 % 128;
            int i42 = i41 % 2;
            int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i44 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i45 = i43 + (-890054514) + (((~(80694034 | i44)) | (-293296461)) * (-983)) + (((~(i44 | (-293296461))) | 4933888) * 983);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 != null) {
            int i48 = 0;
            while (i48 < strArr5.length) {
                int i49 = b + 121;
                asInterface = i49 % 128;
                if (i49 % 2 == 0) {
                    arrayList2.add(strArr5[i48]);
                    i48 += 66;
                } else {
                    arrayList2.add(strArr5[i48]);
                    i48++;
                }
            }
        }
        int[] iArr = new int[i40];
        int i50 = i40 - 1;
        iArr[i50] = 1;
        Toast.makeText((Context) null, iArr[((i40 * i50) % 2) - 1], 1).show();
        int i51 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i52 = ~startElapsedRealtime;
        int i53 = i51 + (-516636855) + ((~(778040959 | i52)) * (-560)) + ((~(startElapsedRealtime | 805305983)) * (-560)) + (((~((-565438534) | i52)) | 538173509) * 560);
        int i54 = (i53 << 13) ^ i53;
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr32[3])[0] = i55 ^ (i55 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = b + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i5 = ~iMyUid;
        int i6 = ~(1049873225 | i5);
        if (i4 != 553514584 + (((-2124410730) | i6) * (-712)) + (((~(iMyUid | (-1074537505))) | (~(i5 | 2124410729))) * (-712)) + ((1879860768 | i6) * 712)) {
            int i7 = 819519112 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        int i10 = (~((-438273129) | i9)) | 437878880;
        int i11 = ~(iIdentityHashCode | 2141177084);
        if (i8 != (-944045668) + ((i10 | i11) * (-502)) + ((i11 | (~(i9 | (-394249)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            int i12 = 202947004 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i13 = b + 47;
        asInterface = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = b + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i5 = (int) Runtime.getRuntime().totalMemory();
        int i6 = ~i5;
        if (i4 != 2142254032 + (((-1073782785) | i6) * (-369)) + (((~((-517692780) | i6)) | (-1347680323)) * (-369)) + (((~(i5 | 517692779)) | (-1591475564) | (~(i6 | (-273897539)))) * 369)) {
            throw new RuntimeException("517563860");
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        if (i7 != (-1341790316) + (((~(2042036059 | i8)) | 537019905) * (-756)) + (((~i8) | 2042036059) * 756)) {
            int i9 = (-658042448) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = asInterface + 105;
        b = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 35 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ac, code lost:
    
        if (r1 != ((r5 + ((r4 | (~(1876945893 | r2))) * 50)) + (((~(r2 | 147630369)) | ((~(1863541700 | r2)) | (-1876945894))) * 50))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ae, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity.asInterface + 97;
        com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity.b = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:
    
        r11 = (-835372560) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c5, code lost:
    
        r11 = (-1269915800) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ce, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        if (r1 == (((((-2140908540) | r4) * (-970)) + 322883830) + ((r4 | 310904873) * 970))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        if (r1 == ((r7 + (((~(555635094 | r6)) | (-1939799552)) * (-1976))) + ((((~(r4 | 1385622637)) | 1458180) | (~((-1385622638) | r6))) * 988))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r5 = 58444360 + ((r2 | 147630369) * (-50));
        r4 = ~((-13404194) | r2);
        r2 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ScholarBenefitActivity scholarBenefitActivity, Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        b = i2 % 128;
        int i3 = i2 % 2;
        SeekBar seekBar = ((ActivityScholarBenefitBinding) ((ViewBinding) scholarBenefitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).sbRegisterProgression;
        int i4 = 100 / ((generateUltraHdrSupportedCombinationList) scholarBenefitActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b;
        Intrinsics.checkNotNull(num);
        seekBar.setProgress(i4 * num.intValue());
        if (num.intValue() == 1) {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarBenefitActivity, R.id.act_scholar_frame, new isRawSupported(), false);
            int i5 = asInterface + 19;
            b = i5 % 128;
            int i6 = i5 % 2;
        } else if (num.intValue() == 2) {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarBenefitActivity, R.id.act_scholar_frame, new getOpeningBlocker(), false);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean g() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    static {
        g = 0;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = d + 43;
        g = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(1180370161, new Object[]{this}, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1180370160, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima5).substring(12, 13).codePointAt(0) + 669963504, lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2())).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1234734119, new Object[]{this}, AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1234734119, lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction_message).substring(0, 1).length() + 2105238717);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        b = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 91;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void cancelAll() {
        TuitionPaymentFragmentbindingInflater1 = -228889550250760065L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return Integer.valueOf(R.layout.activity_scholar_benefit);
    }
}
