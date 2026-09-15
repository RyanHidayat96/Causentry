package com.bpjstku.presentation.branchoffice;

import android.content.ComponentCallbacks;
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
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityBranchOfficeBinding;
import com.bpjstku.databinding.LayoutBottomsheetBranchOfficeBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.presentation.branchoffice.BranchOfficeActivity;
import com.bpjstku.util.utils.UserLocation;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.BufferProviderState;
import defpackage.ExperimentalCamera2Interop;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.TransformExperimental;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.WindowDecorActionBar3;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.acquireBuffer;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.drawSelectorCompat;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.onOptionMatched;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setHasEmbeddedTabs;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010 R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010#R\u001a\u0010\u0017\u001a\u00020$8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b\u001a\u0010&"}, d2 = {"Lcom/bpjstku/presentation/branchoffice/BranchOfficeActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityBranchOfficeBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "a", "Lcom/bpjstku/domain/branchoffice/model/Office;", "p0", "(Lcom/bpjstku/domain/branchoffice/model/Office;)V", "TuitionPaymentFragmentbindingInflater1", "g", "asBinder", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroy", "LoutputFormatToAudioProfile;", "d", "LoutputFormatToAudioProfile;", "LacquireBuffer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "LdrawSelectorCompat;", "Lcom/bpjstku/domain/branchoffice/model/Office;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/RelativeLayout;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BranchOfficeActivity extends BindingBaseActivity<ActivityBranchOfficeBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f471a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private BottomSheetBehavior<RelativeLayout> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Office TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {42, -104, -68, 105};
    private static final int $$f = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 108;
    private static int cancelAll = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new outputFormatToAudioProfile(this);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int d = R.layout.activity_branch_office;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = i8 | i6;
        int i11 = (~((~i6) | i2)) | (~i10);
        int i12 = (~(i | i7 | i6)) | (~(i10 | i2));
        int i13 = i6 + i2 + i4 + (528639218 * i3) + ((-532493036) * i5);
        int i14 = i13 * i13;
        int i15 = ((i6 * 873666089) - 1460666368) + (873666089 * i2) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i4) + (1819279360 * i3) + ((-1621098496) * i5) + (586088448 * i14);
        int i16 = (i6 * (-1573143961)) + 2078511484 + (i2 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i4 * (-1573143025)) + (i3 * 123045422) + (i5 * (-1548035028)) + (i14 * 1845559296);
        int i17 = i15 + (i16 * i16 * 1848705024);
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? b(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        BranchOfficeActivity branchOfficeActivity = (BranchOfficeActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = asBinder + 19;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        branchOfficeActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i21 = asInterface + 39;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.presentation.branchoffice.BranchOfficeActivity.$$a
            int r5 = 144 - r5
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r5 + 1
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.branchoffice.BranchOfficeActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    public BranchOfficeActivity() {
        final BranchOfficeActivity branchOfficeActivity = this;
        this.b = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.branchoffice.BranchOfficeActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = branchOfficeActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<drawSelectorCompat>() { // from class: com.bpjstku.presentation.branchoffice.BranchOfficeActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [drawSelectorCompat, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final drawSelectorCompat invoke() {
                ComponentCallbacks componentCallbacks = branchOfficeActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(drawSelectorCompat.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.branchoffice.BranchOfficeActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/bpjstku/presentation/branchoffice/BranchOfficeActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "office", "Lcom/bpjstku/domain/branchoffice/model/Office;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, Office office) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) BranchOfficeActivity.class);
            intent.putExtra("branch_location", office);
            context.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityBranchOfficeBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BranchOfficeActivity$bindingInflater$1 branchOfficeActivity$bindingInflater$1 = BranchOfficeActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = asBinder + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return branchOfficeActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.d;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        AppCompatImageView appCompatImageView = ((ActivityBranchOfficeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).ivExpandBottomSheetDirectory;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: hideForActionMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BranchOfficeActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        int i2 = asInterface + 43;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(f471a ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(f471a)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 64838), 1356 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + 38, 894276454, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - ExpandableListView.getPackedPositionChild(0L)), 516 - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionChild(0L) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 25;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        Office office;
        BranchOfficeActivity branchOfficeActivity = (BranchOfficeActivity) objArr[0];
        int i = 2 % 2;
        Intent intent = branchOfficeActivity.getIntent();
        if (intent != null) {
            int i2 = asBinder + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            office = (Office) intent.getParcelableExtra("branch_location");
            int i4 = asInterface + 49;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            office = null;
        }
        branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = office;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        g();
        int i4 = asBinder + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).f898a.observe(this, new Observer() { // from class: init
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                BranchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final Office p0) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LayoutBottomsheetBranchOfficeBinding layoutBottomsheetBranchOfficeBinding = ((ActivityBranchOfficeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutBottomsheetBranchOffice;
        AppCompatTextView appCompatTextView = layoutBottomsheetBranchOfficeBinding.tvNameLocationBranchOFfice;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.label_branch_office_name);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = String.format(string, Arrays.copyOf(new Object[]{p0.TuitionPaymentFragmentbindingInflater1}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        appCompatTextView.setText(str);
        layoutBottomsheetBranchOfficeBinding.tvDescLocationBranchOFfice.setText(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            int i4 = asInterface + 123;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            RelativeLayout relativeLayout = layoutBottomsheetBranchOfficeBinding.containerIconMarkerClosest;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            relativeLayout.setVisibility(4);
        }
        layoutBottomsheetBranchOfficeBinding.imgDirection.setOnClickListener(new View.OnClickListener() { // from class: ensureTabsExist
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {2, -84, 82, -15};
            private static final int $$b = 74;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 8965805785387343989L;

            private static void c(byte b, int i6, short s, Object[] objArr) {
                int i7 = b * 2;
                int i8 = (s * 3) + 4;
                byte[] bArr = $$a;
                int i9 = 98 - (i6 * 3);
                byte[] bArr2 = new byte[i7 + 1];
                int i10 = -1;
                if (bArr == null) {
                    i8++;
                    i9 += i7;
                }
                while (true) {
                    i10++;
                    bArr2[i10] = (byte) i9;
                    if (i10 == i7) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        byte b2 = bArr[i8];
                        i8++;
                        i9 += b2;
                    }
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = 2 % 2;
                int i7 = TuitionPaymentFragmentbindingInflater1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 != 0) {
                    BranchOfficeActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p0, view);
                    int i8 = 74 / 0;
                } else {
                    BranchOfficeActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p0, view);
                }
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
            }

            private static void a(char[] cArr, int i6, Object[] objArr) throws Throwable {
                Object obj;
                int i7 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (true) {
                    obj = null;
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i8 = $10 + 63;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2624 - View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() & 9053247990562531611L & TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39422), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 481, 37 - View.getDefaultSize(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i10 = getrealtimecapturelatency.b;
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - TextUtils.indexOf("", "", 0)), KeyEvent.normalizeMetaState(0) + 2624, 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i10] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (9053247990562531611L ^ TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 481, View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39421 - ImageFormat.getBitsPerPixel(0)), 481 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr2);
                int i11 = $11 + 61;
                $10 = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r26, int r27) {
                /*
                    Method dump skipped, instruction units count: 2080
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ensureTabsExist.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, int):java.lang.Object[]");
            }
        });
        int i6 = asBinder + 93;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final void TuitionPaymentFragmentbindingInflater1(Office p0) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            supportFragmentManager.beginTransaction().replace(R.id.flMap, setHasEmbeddedTabs.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0)).commitAllowingStateLoss();
            int i3 = 49 / 0;
        } else {
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            supportFragmentManager2.beginTransaction().replace(R.id.flMap, setHasEmbeddedTabs.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0)).commitAllowingStateLoss();
        }
        int i4 = asBinder + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void g() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(this, "");
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        if (!ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            String string = getString(R.string.error_message_location_gps_disabled);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, string, new Function0() { // from class: completeDeferredDestroyActionMode
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                    return (Unit) BranchOfficeActivity.TuitionPaymentFragmentbindingInflater1(FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 822350138, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -822350136);
                }
            });
            int i4 = asInterface + 59;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.new AnonymousClass4(new String[]{"android.permission.ACCESS_FINE_LOCATION"}));
        final Function1 function1 = new Function1() { // from class: shouldAnimateContextView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj2};
                return (Unit) BranchOfficeActivity.TuitionPaymentFragmentbindingInflater1(FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -305280479, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 305280479);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: animateToMode
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                BranchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        BranchOfficeActivity branchOfficeActivity = (BranchOfficeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BranchOfficeActivity branchOfficeActivity2 = branchOfficeActivity;
        Intrinsics.checkNotNullParameter(branchOfficeActivity2, "");
        branchOfficeActivity2.getWindow().addFlags(8192);
        branchOfficeActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityBranchOfficeBinding) ((ViewBinding) branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityBranchOfficeBinding) ((ViewBinding) branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(branchOfficeActivity.getString(R.string.title_activity_branch_office));
        RelativeLayout relativeLayout = ((ActivityBranchOfficeBinding) ((ViewBinding) branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutBottomsheetBranchOffice.rlBottomSheetBranchOffice;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        BottomSheetBehavior<RelativeLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(relativeLayout);
        branchOfficeActivity.TuitionPaymentFragmentbindingInflater1 = bottomSheetBehaviorFrom;
        Object obj = null;
        if (bottomSheetBehaviorFrom == null) {
            int i4 = asBinder + 61;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 94 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            bottomSheetBehaviorFrom = null;
        }
        bottomSheetBehaviorFrom.setState(4);
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior = branchOfficeActivity.TuitionPaymentFragmentbindingInflater1;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.setPeekHeight(720);
        BottomSheetBehavior<RelativeLayout> bottomSheetBehavior2 = branchOfficeActivity.TuitionPaymentFragmentbindingInflater1;
        if (bottomSheetBehavior2 == null) {
            int i6 = asBinder + 3;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 == 0) {
                obj.hashCode();
                throw null;
            }
            bottomSheetBehavior2 = null;
        }
        bottomSheetBehavior2.setHideable(false);
        return null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            Object obj = null;
            if (p0.getItemId() == 16908332) {
                int i2 = asBinder + 117;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = asBinder + 63;
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        if (((acquireBuffer) this.b.getValue()).isDisposed()) {
            return;
        }
        int i4 = asBinder + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        ((acquireBuffer) this.b.getValue()).dispose();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
            int iMyTid = 15 - (Process.myTid() >> 22);
            Object[] objArr2 = new Object[1];
            c((short) 141, (byte) 52, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, absoluteGravity, iMyTid, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{43607, 16500, 1282, 32459, 43574, 6778, 45478, 29081, 50104, 33789, 6950, 1605, 31032, 28007, 33516, 40120, 38574, 55015, 62518, 13582, 3130, 16471, 24494, 52100, 42420, 10751}, View.combineMeasuredStates(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{62149, 45698, 61846, 34828, 62112, 59534, 17719, 34652, 39734, 28935, 61362, 61694, 8608, 40835, 30266, 27224, 52780, 9231, 179}, View.MeasureSpec.getSize(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int iIndexOf = 1031 - TextUtils.indexOf("", "");
            int iAlpha = Color.alpha(0) + 15;
            Object[] objArr5 = new Object[1];
            c((short) 89, (byte) 52, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, iIndexOf, iAlpha, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 37, bArr[7], bArr[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, packedPositionGroup, keyRepeatDelay, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[3])[0];
            int i3 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (~(438843564 | i4)) | (-985644223) | (~(683123734 | i4));
            int i6 = (-291462657) + (((~(iIdentityHashCode | (-136323077))) | i5) * 590) + (i5 * (-1180)) + (((~((-683123735) | i4)) | (~(i4 | (-438843565)))) * 590) + 941482632;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{186, 6117, 54796, 46564, 208, 19940, 25274, 47781, 26900, 54377, 51245, 52522, 54237, 15019, 20895, 22461, 15433, 33137, 10025, 65065}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_prima).substring(0, 4).length() - 4, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{14831, 18377, 43020, 15788, 14726, 7629, 7337, 13026, 20507, 33856, 46648, 17781, 60071, 27336, 12223, 57316, 1324, 53574, 22824, 30313}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_klik_bca).substring(1, 3).codePointAt(0) - 97, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1580368557};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46038), (ViewConfiguration.getTouchSlop() >> 8) + 1134, 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 941482632, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cBlue = (char) Color.blue(0);
                    int defaultSize = 1031 - View.getDefaultSize(0, 0);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 15;
                    Object[] objArr12 = new Object[1];
                    c((short) 141, (byte) 52, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, defaultSize, absoluteGravity2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 45993), View.MeasureSpec.getSize(0) + 1117, View.resolveSizeAndState(0, 0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i9 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) 37, bArr2[7], bArr2[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, keyRepeatTimeout, i9, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{43607, 16500, 1282, 32459, 43574, 6778, 45478, 29081, 50104, 33789, 6950, 1605, 31032, 28007, 33516, 40120, 38574, 55015, 62518, 13582, 3130, 16471, 24494, 52100, 42420, 10751}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{62149, 45698, 61846, 34828, 62112, 59534, 17719, 34652, 39734, 28935, 61362, 61694, 8608, 40835, 30266, 27224, 52780, 9231, 179}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_detected).substring(0, 43).codePointAt(12) - 110, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1030;
                        int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                        Object[] objArr16 = new Object[1];
                        c((short) 89, (byte) 52, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, i10, i11, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iBlue = 1031 - Color.blue(0);
                        int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        Object[] objArr17 = new Object[1];
                        c((short) 141, (byte) 52, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyTid, iBlue, iMakeMeasureSpec, 1357589585, false, (String) objArr17[0], null);
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
            int i14 = asInterface + 69;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i19 = i16 + (((1843405797 + (((~(108074861 | iIdentityHashCode2)) | (-352355032)) * (-948))) + ((~((~iIdentityHashCode2) | (-285245587))) * (-948))) - 794370996);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i22 = 0;
                while (i22 < strArr3.length) {
                    int i23 = asBinder + 73;
                    asInterface = i23 % 128;
                    if (i23 % 2 == 0) {
                        arrayList.add(strArr3[i22]);
                        i22 += 33;
                    } else {
                        arrayList.add(strArr3[i22]);
                        i22++;
                    }
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i28 = ~(460553824 | i27);
            int i29 = ~i27;
            int i30 = i28 | (~(704833994 | i29));
            int i31 = ~((-460553825) | i29);
            int i32 = i24 + 199587005 + ((i30 | i31) * (-516)) + (((~(i27 | (-536904075))) | (~((-167929921) | i29))) * 516) + ((167929920 | i31) * 516);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr19[2])[0] = i34 ^ (i34 << 5);
            int i35 = asBinder + 71;
            asInterface = i35 % 128;
            int i36 = i35 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
            short s = (short) 37;
            Object[] objArr20 = new Object[1];
            c(s, (byte) s, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, iKeyCodeFromString, maximumDrawingCacheSize, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i37 = asInterface + 1;
            asBinder = i37 % 128;
            int i38 = i37 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                int i39 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                int capsMode2 = 23 - TextUtils.getCapsMode("", 0, 0);
                Object[] objArr21 = new Object[1];
                c((short) 89, (byte) 52, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf2, i39, capsMode2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i40 = ~((int) Runtime.getRuntime().freeMemory());
            int i41 = 385801793 + ((1064302555 | i40) * 184) + (((~(i40 | 1007678923)) | 325849690) * 184) + 1812898567;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i43 ^ (i43 << 5);
            int i44 = asInterface + 125;
            asBinder = i44 % 128;
            int i45 = i44 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{186, 6117, 54796, 46564, 208, 19940, 25274, 47781, 26900, 54377, 51245, 52522, 54237, 15019, 20895, 22461, 15433, 33137, 10025, 65065}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).length() - 1, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{14831, 18377, 43020, 15788, 14726, 7629, 7337, 13026, 20507, 33856, 46648, 17781, 60071, 27336, 12223, 57316, 1324, 53574, 22824, 30313}, ViewConfiguration.getKeyRepeatDelay() >> 16, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1580368557};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Color.rgb(0, 0, 0) + 16819265), View.getDefaultSize(0, 0) + 1726, KeyEvent.getDeadChar(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1812898567, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                int iKeyCodeFromString2 = 1755 - KeyEvent.keyCodeFromString("");
                int iAxisFromString = MotionEvent.axisFromString("") + 24;
                Object[] objArr26 = new Object[1];
                c((short) 89, (byte) 52, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetBefore, iKeyCodeFromString2, iAxisFromString, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{43607, 16500, 1282, 32459, 43574, 6778, 45478, 29081, 50104, 33789, 6950, 1605, 31032, 28007, 33516, 40120, 38574, 55015, 62518, 13582, 3130, 16471, 24494, 52100, 42420, 10751}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step1).substring(14, 15).codePointAt(0) - 110, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{62149, 45698, 61846, 34828, 62112, 59534, 17719, 34652, 39734, 28935, 61362, 61694, 8608, 40835, 30266, 27224, 52780, 9231, 179}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                    int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0, 0);
                    int iAlpha2 = 23 - Color.alpha(0);
                    byte b = $$a[7];
                    short s2 = b;
                    Object[] objArr29 = new Object[1];
                    c(s2, (byte) (s2 | 52), b, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, iIndexOf2, iAlpha2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iRed = Color.red(0) + 1755;
                    int i46 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    short s3 = (short) 37;
                    Object[] objArr30 = new Object[1];
                    c(s3, (byte) s3, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(modifierMetaStateMask, iRed, i46, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrB$7879113[0])[0] != ((int[]) objArrB$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrB$7879113[4];
            if (strArr5 != null) {
                int i47 = asInterface + 107;
                asBinder = i47 % 128;
                int i48 = i47 % 2;
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        int i49 = asBinder + 17;
        asInterface = i49 % 128;
        int i50 = i49 % 2;
        int i51 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i52 = ~startElapsedRealtime;
        int i53 = i51 + (((~(70572618 | i52)) | (~((-283175045) | startElapsedRealtime)) | (~(i52 | 283175044))) * 959) + 1290945404 + (((~(startElapsedRealtime | 283175044)) | (~(i52 | (-283175045))) | (~(70572618 | startElapsedRealtime))) * 959);
        int i54 = (i53 << 13) ^ i53;
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr31[3])[0] = i55 ^ (i55 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cb, code lost:
    
        if (r1 != ((((-1947210900) + ((r2 | (-2136014960)) * 140)) + (((~((-2136014960) | r4)) | 419430476) * (-280))) + (((~(r2 | (-419430477))) | ((~(420103628 | r4)) | (-2136688112))) * 140))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cd, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.branchoffice.BranchOfficeActivity.asBinder + 67;
        com.bpjstku.presentation.branchoffice.BranchOfficeActivity.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        r1 = (-1899060844) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e3, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00eb, code lost:
    
        throw new java.lang.RuntimeException("-1720654880");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        if (r1 == (((1679164088 + (((~(1288987379 | r5)) | (~((-458999837) | r4))) * 1900)) + (((~(r5 | 458999836)) | (~(r4 | (-1288987380)))) * (-950))) + (((~(r4 | 458999836)) | (~(r5 | (-1288987380)))) * 950))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008f, code lost:
    
        if (r1 == ((((((~(1281353944 | r5)) | (~((-451366402) | r4))) | (~(r5 | 451366401))) * 959) + 152103720) + (((~(r4 | 451366401)) | ((~(r5 | (-451366402))) | (~(1281353944 | r4)))) * 959))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0091, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.branchoffice.BranchOfficeActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = ~((-579862530) | iFreeMemory);
        int i6 = ~iFreeMemory;
        if (i4 != (-214170511) + ((i5 | (~(i6 | 2147220475))) * 497) + (((~(iFreeMemory | 2147220475)) | (~((-737370404) | i6)) | 157507874) * 497)) {
            int i7 = (-735630980) % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        if (i8 != (((-947944364) + (((~(1829038805 | i9)) | (~((-113127475) | iIdentityHashCode))) * (-370))) + ((((~(iIdentityHashCode | 1829038805)) | (~(i9 | (-113127475)))) | 1761659589) * (-370))) - 1020981062) {
            throw null;
        }
        super.onStart();
        int i10 = asInterface + 53;
        asBinder = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i2 != ((1138495470 + (((~((-286306314) | iIdentityHashCode)) | (~((-1116293857) | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | (-1860913907))) | ((~((-1030926364) | iIdentityHashCode)) | 744620050)) * (-69))) - 2129307116) {
            int i3 = asBinder + 119;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int[] iArr = new int[1041399811];
                iArr[1041399810] = 1;
                int i4 = 1985773574 / 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1041399811];
                iArr2[1041399810] = 1;
                int i5 = 1985773574 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i6 = asInterface + 57;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i10 = ~((-37898854) | i9);
        int i11 = ~i9;
        if (i8 != 669516476 + ((i10 | (~(i11 | 2079289325))) * 920) + (((~((-325479142) | i11)) | 37898853) * 920) + (((~(i9 | 2079289325)) | (~((-37898854) | i11)) | (~((-287580289) | i9))) * 920)) {
            throw new RuntimeException("-1348733410");
        }
        super.onCreate(bundle);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws IOException {
        final BranchOfficeActivity branchOfficeActivity = (BranchOfficeActivity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!bool.booleanValue()) {
            branchOfficeActivity.g();
        } else {
            Office office = branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (office == null) {
                ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
                BranchOfficeActivity branchOfficeActivity2 = branchOfficeActivity;
                Function1 function1 = new Function1() { // from class: getDecorToolbar
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return BranchOfficeActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (UserLocation) obj2);
                    }
                };
                Intrinsics.checkNotNullParameter(branchOfficeActivity2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                ExperimentalCamera2Interop.b(branchOfficeActivity2, new onOptionMatched(function1));
            } else if (office != null) {
                int i3 = asInterface + 111;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                branchOfficeActivity.TuitionPaymentFragmentbindingInflater1(office);
                branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(office);
                int i5 = asInterface + 51;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(BranchOfficeActivity branchOfficeActivity, UserLocation userLocation) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (userLocation != null) {
            int i4 = i3 + 27;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            ((drawSelectorCompat) branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1(String.valueOf(userLocation.TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(userLocation.b));
        } else {
            UserLocation userLocation2 = new UserLocation(0.0d, 0.0d);
            ((drawSelectorCompat) branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1(String.valueOf(userLocation2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(userLocation2.b));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(BranchOfficeActivity branchOfficeActivity, Office office, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_get_direction_branch_office", "get_direction_branch_office"));
            Intrinsics.checkNotNullParameter(branchOfficeActivity, "");
            Intrinsics.checkNotNullParameter("get_direction_branch_office", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("get_direction_branch_office", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("get_direction_branch_office", mapMutableMapOf);
            double d = office.b;
            double d2 = office.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                StringBuilder sb = new StringBuilder("google.navigation:q=");
                sb.append(d);
                sb.append(",");
                sb.append(d2);
                Uri uri = Uri.parse(sb.toString());
                Intrinsics.checkNotNullExpressionValue(uri, "");
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(268435456);
                intent.setPackage("com.google.android.apps.maps");
                ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().startActivity(intent);
                int i2 = asBinder + 71;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e2) {
                e2.printStackTrace();
                String string = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.message_no_app_support);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
            }
            ViewPortBuilder.b();
            int i4 = asInterface + 105;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(BranchOfficeActivity branchOfficeActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_list_branch_office", "view_list_branch_office"));
        Intrinsics.checkNotNullParameter(branchOfficeActivity, "");
        Intrinsics.checkNotNullParameter("view_list_branch_office", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_list_branch_office", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_list_branch_office", mapMutableMapOf);
        WindowDecorActionBar3 windowDecorActionBar3 = new WindowDecorActionBar3();
        FragmentManager supportFragmentManager = branchOfficeActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        windowDecorActionBar3.show(supportFragmentManager, windowDecorActionBar3.getTag());
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BranchOfficeActivity branchOfficeActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            branchOfficeActivity.MediaBrowserCompat();
            str = "loading_nearest_branch_office_result";
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            branchOfficeActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            branchOfficeActivity.TuitionPaymentFragmentbindingInflater1((Office) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            branchOfficeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Office) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            str = "success_nearest_branch_office_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            branchOfficeActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_nearest_branch_office_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_nearest_branch_office_result", str));
        Intrinsics.checkNotNullParameter(branchOfficeActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        int i4 = asBinder + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(BranchOfficeActivity branchOfficeActivity, Boolean bool) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -305280479, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{branchOfficeActivity, bool}, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 305280479);
    }

    public static /* synthetic */ Unit b(BranchOfficeActivity branchOfficeActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 822350138, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{branchOfficeActivity}, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -822350136);
    }

    static {
        INotificationSideChannel = 0;
        d();
        INSTANCE = new Companion(null);
        int i = cancelAll + 57;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iCodePointAt = (-1627576765) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_8).substring(21, 22).codePointAt(0);
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1410659638, (-485720459) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_tunai_payment_instruction).substring(12, 13).length(), iCodePointAt, new Object[]{this}, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1410659637);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 278323721, TransformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, FileExtKt$readLinesSafe$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -278323718);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void d() {
        f471a = 830356068203671558L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 107
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.presentation.branchoffice.BranchOfficeActivity.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
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
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.branchoffice.BranchOfficeActivity.$$i(short, int, int):java.lang.String");
    }
}
