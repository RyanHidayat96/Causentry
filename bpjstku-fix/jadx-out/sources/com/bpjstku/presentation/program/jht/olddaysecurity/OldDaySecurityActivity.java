package com.bpjstku.presentation.program.jht.olddaysecurity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
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
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.menu.model.response.AvailabilityMenuItem;
import com.bpjstku.databinding.ActivityOldDaySecurityBinding;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.OldDaySecurityCheckRsjhtActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.simulation.OldDaySecuritySimulationActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ComponentActivityExternalSyntheticLambda10;
import defpackage.CoordinateTransform;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionProcessor;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.access000;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMaxImages;
import defpackage.getSensorRect;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;
import defpackage.mapPoint;
import defpackage.onNestedPreScroll;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setCurrentRunnable;
import defpackage.setExposureCompensationIndex;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.AbstractMap$values$1$iterator$1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0016\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0017\u0010\n\u001a\u0004\u0018\u00010\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0015\u0010\f\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010)\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010\u0015R\u0015\u0010\u000e\u001a\u00020*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u001a\u0010\u0018\u001a\u00020+8\u0015X\u0095D¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b!\u0010-R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00020.8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u00100"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/OldDaySecurityActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityOldDaySecurityBinding;", "<init>", "()V", "", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "asInterface", "asBinder", "a", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Laccess000;", "notify", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCamera2CameraControlImplExternalSyntheticLambda4;", "d", "LsetCurrentRunnable;", "cancel", "LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;", "onTransact", "LlambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl;", "", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetStreamUseCaseSupportedCombinationList;", "INotificationSideChannel", "LgetStringOrNull;", "RemoteActionCompatParcelizer", "LgetStringOrNull;", "LsetExposureCompensationIndex;", "cancelAll", "g", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OldDaySecurityActivity extends BindingBaseActivity<ActivityOldDaySecurityBinding> {
    private static int INotificationSideChannelDefault;
    private static long INotificationSideChannelStub;
    private static int MediaBrowserCompat;
    private static final int TuitionPaymentFragmentbindingInflater1;
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f582a;
    private static final int b;
    private static char getInterfaceDescriptor;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getStringOrNull asBinder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl b;
    private static final byte[] $$c = {83, -4, -55, -17};
    private static final int $$f = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {48, -110, 22, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 12;
    private static int read = 1;
    private static int write = 0;
    private static int IconCompatParcelizer = 1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: getMaxAeRegionCount
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private List<ClaimSegmenItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: getTorchControl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            return (setExposureCompensationIndex) OldDaySecurityActivity.b(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 1825723726, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), objArr, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -1825723725);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int d = R.layout.activity_old_day_security;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
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

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i3);
        int i11 = i9 | i10;
        int i12 = ~i6;
        int i13 = i9 | (~(i12 | i2)) | i10;
        int i14 = (~(i3 | i6 | i2)) | (~(i7 | i12 | i8));
        int i15 = i6 + i2 + i5 + (1322235619 * i) + (440487356 * i4);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i6) - 2100690944) + ((-281430247) * i2) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i5) + ((-942931968) * i) + ((-1410334720) * i4) + (1251606528 * i16);
        int i18 = (i6 * 157034417) + 1376579869 + (i2 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i5 * 157035401) + (i * (-982187909)) + (i4 * (-1869533796)) + (i16 * (-899022848));
        int i19 = i17 + (i18 * i18 * (-511311872));
        if (i19 != 1) {
            if (i19 != 2) {
                return i19 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
            }
            OldDaySecurityActivity oldDaySecurityActivity = (OldDaySecurityActivity) objArr[0];
            int i20 = 2 % 2;
            int i21 = write + 105;
            int i22 = i21 % 128;
            IconCompatParcelizer = i22;
            int i23 = i21 % 2;
            getStringOrNull getstringornull = oldDaySecurityActivity.asBinder;
            if (getstringornull != null) {
                int i24 = i22 + 53;
                write = i24 % 128;
                int i25 = i24 % 2;
                getstringornull.dismiss();
                int i26 = IconCompatParcelizer + 49;
                write = i26 % 128;
                int i27 = i26 % 2;
            }
            return Unit.INSTANCE;
        }
        OldDaySecurityActivity oldDaySecurityActivity2 = (OldDaySecurityActivity) objArr[0];
        int i28 = 2 % 2;
        String string = oldDaySecurityActivity2.getString(R.string.label_balance_check);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = oldDaySecurityActivity2.getString(R.string.label_please_check_your_balance);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        OldDaySecurityMenu oldDaySecurityMenu = new OldDaySecurityMenu(1, string, R.drawable.ic_balance_chcek, string2);
        String string3 = oldDaySecurityActivity2.getString(R.string.label_simulation);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = oldDaySecurityActivity2.getString(R.string.label_check_old_day_security_simulation);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        OldDaySecurityMenu oldDaySecurityMenu2 = new OldDaySecurityMenu(2, string3, R.drawable.ic_simulation, string4);
        String string5 = oldDaySecurityActivity2.getString(R.string.label_claim_old_day_security);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = oldDaySecurityActivity2.getString(R.string.label_claim_old_day_security_description);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        OldDaySecurityMenu oldDaySecurityMenu3 = new OldDaySecurityMenu(3, string5, R.drawable.ic_eclaim, string6);
        String string7 = oldDaySecurityActivity2.getString(R.string.label_check_tracking_eclaim);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        OldDaySecurityMenu oldDaySecurityMenu4 = new OldDaySecurityMenu(4, "Lacak Klaim JHT", R.drawable.ic_tracking_claim, string7);
        String string8 = oldDaySecurityActivity2.getString(R.string.label_rsjht);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        String string9 = oldDaySecurityActivity2.getString(R.string.label_check_rsjht);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        setExposureCompensationIndex setexposurecompensationindex = new setExposureCompensationIndex(oldDaySecurityActivity2, CollectionsKt.mutableListOf(oldDaySecurityMenu, oldDaySecurityMenu2, oldDaySecurityMenu3, oldDaySecurityMenu4, new OldDaySecurityMenu(5, string8, 2131230932, string9)), new getSensorRect(oldDaySecurityActivity2));
        int i29 = IconCompatParcelizer + 29;
        write = i29 % 128;
        int i30 = i29 % 2;
        return setexposurecompensationindex;
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
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 53 - r8
            int r9 = r9 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-11)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.c(short, short, int, java.lang.Object[]):void");
    }

    public OldDaySecurityActivity() {
        final OldDaySecurityActivity oldDaySecurityActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<access000>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1
            private static final byte[] $$c = {60, 80, 13, 34};
            private static final int $$f = 72;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {46, 47, -18, 64, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
            private static final int $$e = 211;
            private static final byte[] $$a = {6, -86, -9, -124, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
            private static final int $$b = 54;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int $a = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -8126814085566487277L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 34097;
            private static int[] b = {-631729170, -2129713473, -1057161011, -2103303173, -811572737, -1261037496, 35837582, 1063758646, 74382830, 1444975871, -2079782734, 2081169536, 1318255250, 381350102, 1660014112, -1619413159, -888031809, -677703508};
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r7 = 53 - r7
                    int r5 = 103 - r5
                    byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1.$$d
                    int r6 = 93 - r6
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L10
                    r4 = r6
                    r3 = r2
                    goto L22
                L10:
                    r3 = r2
                L11:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L20
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L20:
                    r4 = r0[r6]
                L22:
                    int r6 = r6 + 1
                    int r5 = r5 + r4
                    int r5 = r5 + (-11)
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1.d(int, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(int r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = r8 + 103
                    int r6 = r6 * 17
                    int r6 = 34 - r6
                    byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1.$$a
                    int r7 = r7 * 33
                    int r7 = 37 - r7
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r5 = r2
                    r8 = r6
                    goto L29
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r3 = r0[r7]
                L29:
                    int r8 = r8 + r3
                    int r8 = r8 + (-3)
                    int r7 = r7 + 1
                    r3 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1.e(int, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [access000, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final access000 invoke() {
                ZoomGestureDetectorZoomEvent koin;
                int i = 2 % 2;
                ComponentCallbacks componentCallbacks = oldDaySecurityActivity;
                mapPoint mappoint = this.$qualifier;
                Function0<CoordinateTransform> function0 = this.$parameters;
                if (componentCallbacks instanceof getEventTime) {
                    int i2 = $a + 49;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                    koin = ((getEventTime) componentCallbacks).getKoin();
                    int i4 = $a + 121;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                }
                return koin.b.b(Reflection.getOrCreateKotlinClass(access000.class), mappoint, function0);
            }

            private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
                    int i4 = $10 + 65;
                    $11 = i4 % 128;
                    int i5 = i4 % i2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - KeyEvent.getDeadChar(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 1235, 35 - TextUtils.indexOf("", ""), -653973969, false, $$g(b2, b3, (byte) (b3 | 20)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2764, 14 - (ViewConfiguration.getPressedStateDuration() >> 16), 1504416861, false, $$g(b4, b5, (byte) (b5 | 18)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 252, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2890, TextUtils.indexOf((CharSequence) "", '0') + 18, 2012627446, false, $$g(b6, b7, (byte) (b7 | 19)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
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
                int i6 = $10 + 67;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }

            private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                int length;
                int[] iArr2;
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = b;
                int i3 = -1870535734;
                int i4 = 1;
                int i5 = 0;
                if (iArr3 != null) {
                    int i6 = $10 + 123;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
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
                                byte b2 = (byte) i5;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3290, KeyEvent.keyCodeFromString("") + 31, 1948206109, false, $$g(b2, b3, (byte) (b3 | 56)), new Class[]{Integer.TYPE});
                            }
                            iArr2[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7++;
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
                int[] iArr5 = b;
                char c = '0';
                float f = 0.0f;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i8 = 0;
                    while (i8 < length3) {
                        int i9 = $10 + 39;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            Object[] objArr3 = new Object[i4];
                            objArr3[0] = Integer.valueOf(iArr5[i8]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 3290 - TextUtils.lastIndexOf("", c, 0), 31 - KeyEvent.getDeadChar(0, 0), 1948206109, false, $$g(b4, b5, (byte) (b5 | 56)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        } else {
                            length3 = length3;
                            Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.makeMeasureSpec(0, 0) + 3291, View.MeasureSpec.makeMeasureSpec(0, 0) + 31, 1948206109, false, $$g(b6, b7, (byte) (b7 | 56)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            i8++;
                        }
                        length3 = length3;
                        c = '0';
                        f = 0.0f;
                        i4 = 1;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                int i10 = 2;
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i11 = $11 + 75;
                    $10 = i11 % 128;
                    int i12 = i11 % i10;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i13 = 17;
                    for (int i14 = 1; i13 > i14; i14 = 1) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 2559 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - View.combineMeasuredStates(0, 0), 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i13--;
                    }
                    int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 28879), 348 - (Process.myTid() >> 22), (Process.myPid() >> 22) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    int i17 = $11 + 41;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = 4 % 3;
                    }
                    i10 = 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 294761. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r60, java.lang.String[] r61, int r62, int r63, int r64) {
                /*
                    Method dump skipped, instruction units count: 29476
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, byte r7, int r8) {
                /*
                    byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1.$$c
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    int r6 = r6 * 2
                    int r6 = 1 - r6
                    int r8 = 122 - r8
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L28
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L22:
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L28:
                    int r8 = -r8
                    int r8 = r8 + r3
                    int r7 = r7 + 1
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$1.$$g(int, byte, int):java.lang.String");
            }
        });
        final OldDaySecurityActivity oldDaySecurityActivity2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = oldDaySecurityActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
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
        this.asInterface = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getStreamUseCaseSupportedCombinationList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getStreamUseCaseSupportedCombinationList invoke() {
                ComponentCallbacks componentCallbacks = oldDaySecurityActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.a = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = oldDaySecurityActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/OldDaySecurityActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, OldDaySecurityActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        MediaBrowserCompat = 0;
        onTransact();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentbindingInflater1 = 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 3;
        f582a = 4;
        b = 5;
        int i = read + 57;
        MediaBrowserCompat = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
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
            int i4 = $10 + 9;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1235, 35 - Gravity.getAbsoluteGravity(0, 0), -653973969, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2765, TextUtils.indexOf("", "", 0) + 14, 1504416861, false, $$i(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0)), 253 - (ViewConfiguration.getTapTimeout() >> 16), 22 - (ViewConfiguration.getTapTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 65201), 2892 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2012627446, false, $$i(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (INotificationSideChannelStub ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) INotificationSideChannelDefault) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) getInterfaceDescriptor) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 33;
                $10 = i6 % 128;
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

    public static final class TuitionPaymentFragmentbindingInflater1 implements lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b {
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentbindingInflater1(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        @Override // lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityActivity.this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Lapak Asik", 0, null, false, 56);
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = write + 91;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.d;
        if (i3 == 0) {
            int i5 = 26 / 0;
        }
        return i4;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityOldDaySecurityBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        write = i2 % 128;
        int i3 = i2 % 2;
        OldDaySecurityActivity$bindingInflater$1 oldDaySecurityActivity$bindingInflater$1 = OldDaySecurityActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return oldDaySecurityActivity$bindingInflater$1;
    }

    private final void TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2 % 2;
        onNestedPreScroll.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = onNestedPreScroll.INSTANCE;
        onNestedPreScroll onnestedprescrollTuitionPaymentFragmentbindingInflater1 = onNestedPreScroll.Companion.TuitionPaymentFragmentbindingInflater1(p0, new Function0() { // from class: getScreenFlash
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldDaySecurityActivity.cancelAll();
            }
        }, new Function0() { // from class: getSupportedAfMode
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldDaySecurityActivity.g();
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            onnestedprescrollTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager, onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i2 = write + 37;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = write + 51;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            str = userAsBinder.b;
            int i2 = write + 119;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            int i4 = write + 93;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() == 0) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
                d_();
            }
        } else {
            LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            d_();
        }
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        FirebaseRemoteConfig firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        getMaxImages.TuitionPaymentFragmentbindingInflater1 = firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (firebaseRemoteConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        OldDaySecurityActivity oldDaySecurityActivity = this;
        Intrinsics.checkNotNullParameter(oldDaySecurityActivity, "");
        oldDaySecurityActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityOldDaySecurityBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityOldDaySecurityBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_old_day_security));
        RecyclerView recyclerView = ((ActivityOldDaySecurityBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvOldDaySecurity;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((setExposureCompensationIndex) this.g.getValue());
        int i2 = write + 41;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        OldDaySecurityActivity oldDaySecurityActivity = this;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentbindingInflater1.getValue()).onTransact.observe(oldDaySecurityActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getMaxAwbRegionCount
            private static final byte[] $$c = {7, 15, 25, 25};
            private static final int $$f = 122;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {90, 46, 113, 8, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
            private static final int $$e = 72;
            private static final byte[] $$a = {83, -44, 103, 46, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, 49, -64, 9, -15, 5, 55, -40, -22, -12, 11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
            private static final int $$b = 77;
            private static int b = 0;
            private static int asBinder = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -304047161388619637L;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {57190, 57187, 60041, 57191, 60048, 60051, 60040, 60056, 57192, 60035, 57184, 60055, 60075, 60086, 57195, 57193, 60046, 60047, 57194, 60060, 60084, 57197, 60043, 60062, 60045, 60072, 60095, 60053, 57186, 60050, 60063, 60090, 57189, 60088, 60061, 60123, 60068, 60117, 60044, 60145, 60034, 60058, 60085, 60097, 57188, 60093, 60054, 60116, 60052};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57190;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r7, short r8, byte r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = defpackage.getMaxAwbRegionCount.$$a
                    int r9 = 34 - r9
                    int r8 = 65 - r8
                    int r7 = r7 * 3
                    int r7 = 115 - r7
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r8
                    r4 = r2
                    goto L29
                L12:
                    r3 = r2
                L13:
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r9) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L24:
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L29:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + (-2)
                    r8 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxAwbRegionCount.c(byte, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r9 = 103 - r9
                    int r7 = r7 * 52
                    int r7 = r7 + 4
                    byte[] r0 = defpackage.getMaxAwbRegionCount.$$d
                    int r8 = r8 * 52
                    int r8 = r8 + 1
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r9
                    r4 = r2
                    r9 = r7
                    goto L2b
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r8) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L2b:
                    int r3 = r3 + r7
                    int r7 = r3 + (-10)
                    int r9 = r9 + 1
                    r3 = r4
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxAwbRegionCount.d(byte, int, int, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = b + 65;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
                int i5 = b + 53;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 15 / 0;
                }
                return unitTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i4 = $10 + 71;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getTrimmedLength("") + 19472), 2625 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() - (TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9053247990562531611L);
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getOffsetAfter("", 0)), 481 - TextUtils.getCapsMode("", 0, 0), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                        int i6 = getrealtimecapturelatency.b;
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 19472), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2623, AndroidCharacter.getMirror('0') - '#', -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - View.resolveSize(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 481, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                int i7 = $10 + 15;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39423 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-16776735) - Color.rgb(0, 0, 0), View.combineMeasuredStates(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr2);
                int i9 = $10 + 57;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }

            private static void e(int i2, char[] cArr, byte b2, Object[] objArr) throws Throwable {
                int i3;
                Object obj;
                int i4 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i5 = 1770390596;
                long j = 0;
                Object obj2 = null;
                if (cArr2 != null) {
                    int i6 = $10 + 101;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                                int packedPositionType = 2267 - ExpandableListView.getPackedPositionType(j);
                                int i9 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 33;
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionType, i9, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i8++;
                            i5 = 1770390596;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16), 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i2];
                    if (i2 % 2 != 0) {
                        int i10 = $11 + 109;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = i2 - 1;
                        cArr4[i3] = (char) (cArr[i3] - b2);
                    } else {
                        i3 = i2;
                    }
                    if (i3 > 1) {
                        int i12 = $10 + 55;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        } else {
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        }
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                try {
                                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b7 = (byte) 0;
                                        byte b8 = b7;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - TextUtils.indexOf("", "")), 3261 - (ViewConfiguration.getEdgeSlop() >> 16), 31 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -127612708, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            byte b9 = (byte) 0;
                                            byte b10 = b9;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (MotionEvent.axisFromString("") + 22879), Color.rgb(0, 0, 0) + 16777810, 17 - (KeyEvent.getMaxKeyCode() >> 16), 1570859318, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i14 = $10 + 31;
                                            $11 = i14 % 128;
                                            int i15 = i14 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                        } else {
                                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                        }
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                            obj2 = obj;
                        }
                    }
                    for (int i20 = 0; i20 < i2; i20++) {
                        int i21 = $10 + 103;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 75941. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r44, int r45, int r46, int r47) {
                /*
                    Method dump skipped, instruction units count: 7594
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxAwbRegionCount.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, int r7, short r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = r7 + 4
                    int r6 = r6 * 3
                    int r0 = 1 - r6
                    byte[] r1 = defpackage.getMaxAwbRegionCount.$$c
                    int r8 = r8 + 113
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L17
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L2a
                L17:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L1b:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L28:
                    r3 = r1[r8]
                L2a:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getMaxAwbRegionCount.$$g(byte, int, short):java.lang.String");
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannelStub.observe(oldDaySecurityActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getFocusMeteringControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = write + 23;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:14:0x0039, B:13:0x0032, B:11:0x0029), top: B:19:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        write = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 88 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = IconCompatParcelizer + 85;
            write = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
            int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) (b2 | 14), bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetBefore, packedPositionGroup, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                byte b4 = bArr2[7];
                Object[] objArr3 = new Object[1];
                c(b3, b4, (short) (b4 | 36), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, fadingEdgeLength, packedPositionType, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1371569005;
            int i3 = (((~((-153255986) | i2)) | (-1040094200)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 2136916652 + ((~((~i2) | (-153255986))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 154208858;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{29400, 8847, 10771, 33315}, new char[]{38138, 37971, 30236, 36369}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_network_msg).substring(33, 36).length() + 4467), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{9685, 27261, 7813, 37160, 1018, 45960, 63774, 10414, 26338, 50556, 34377, 42777, 56588, 50395, 31449, 29171}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{29400, 8847, 10771, 33315}, new char[]{25520, 38849, 29150, 3661}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_encrypting_data).substring(0, 39).codePointAt(34) + 19793), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{60681, 23944, 24681, 6950, 27374, 55562, 56456, 10815, 3449, 4797, 16821, 27130, 59902, 12083, 39846, 65506}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-513955617};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42048), 1726 - KeyEvent.getDeadChar(0, 0), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 154208858);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                    int iIndexOf = TextUtils.indexOf("", "") + 1755;
                    int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[5];
                    byte b6 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    c(b5, b6, (short) (b6 | 36), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iIndexOf, iKeyCodeFromString, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{29400, 8847, 10771, 33315}, new char[]{60663, 58251, 36748, 27659}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_5).substring(6, 7).codePointAt(0) - 97), ViewConfiguration.getScrollBarSize() >> 8, new char[]{43675, 50389, 50723, 54390, 61909, 36276, 26072, 32873, 61714, 51479, 26514, 26023, 24195, 27764, 36894, 61615, 57817, 13034, 39520, 40217, 14769, 14045}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{29400, 8847, 10771, 33315}, new char[]{63732, 12836, 48458, 51785}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 18831), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1244800247, new char[]{62966, 49225, 52279, 7493, 12505, 6220, 17999, 62592, 30862, 5788, 14574, 54076, 5889, 54804, 34362}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 29944);
                        int i6 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[5];
                        byte b8 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b7, b8, (short) (b8 | 88), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, i6, packedPositionChild, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                        int iRed = 23 - Color.red(0);
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[5];
                        Object[] objArr12 = new Object[1];
                        c(b9, (byte) (b9 | 14), bArr5[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i7, iRed, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrB$5f1425da[0])[0] != ((int[]) objArrB$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i8 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i9 = ~iFreeMemory;
        int i10 = i8 + (-850351108) + ((~(136639755 | i9)) * 979) + ((iFreeMemory | 349242181) * (-979)) + (((~(iFreeMemory | 136639755)) | (~(i9 | 349242181))) * 979);
        int i11 = (i10 << 13) ^ i10;
        int i12 = i11 ^ (i11 >>> 17);
        ((int[]) objArr13[3])[0] = i12 ^ (i12 << 5);
        int i13 = IconCompatParcelizer + 31;
        write = i13 % 128;
        int i14 = i13 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int i15 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i16 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
            byte[] bArr6 = $$a;
            byte b10 = bArr6[5];
            byte b11 = bArr6[7];
            Object[] objArr14 = new Object[1];
            c(b10, b11, (short) (b11 | 140), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, i15, i16, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{29400, 8847, 10771, 33315}, new char[]{60663, 58251, 36748, 27659}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_sdk_invalid).substring(14, 23).codePointAt(3) - 110, new char[]{43675, 50389, 50723, 54390, 61909, 36276, 26072, 32873, 61714, 51479, 26514, 26023, 24195, 27764, 36894, 61615, 57817, 13034, 39520, 40217, 14769, 14045}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{29400, 8847, 10771, 33315}, new char[]{63732, 12836, 48458, 51785}, (char) (18877 - ExpandableListView.getPackedPositionType(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_canceled).substring(13, 14).codePointAt(0) + 1244800132, new char[]{62966, 49225, 52279, 7493, 12505, 6220, 17999, 62592, 30862, 5788, 14574, 54076, 5889, 54804, 34362}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int iMyTid = 1031 - (Process.myTid() >> 22);
            int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr7 = $$a;
            byte b12 = bArr7[5];
            byte b13 = bArr7[7];
            Object[] objArr17 = new Object[1];
            c(b12, b13, (short) (b13 | 36), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(mode, iMyTid, capsMode, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i17 = IconCompatParcelizer + 57;
            write = i17 % 128;
            int i18 = i17 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i19 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                byte b14 = $$a[7];
                Object[] objArr18 = new Object[1];
                c(b14, (byte) (b14 | 52), (short) DerHeader.TAG_CLASS_PRIVATE, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, i19, iResolveSizeAndState, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr19[3])[0];
            int i21 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iNextInt = new Random().nextInt(1166823034);
            int i22 = 1579501963 + (((~((-18904205) | iNextInt)) | (~((~iNextInt) | 225375965))) * (-318)) + (((~(86275213 | iNextInt)) | 139100752) * (-318)) + (((~(iNextInt | (-86275214))) | (-158004957)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 2004935457;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[2])[0] = i24 ^ (i24 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{29400, 8847, 10771, 33315}, new char[]{38138, 37971, 30236, 36369}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 4471), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{9685, 27261, 7813, 37160, 1018, 45960, 63774, 10414, 26338, 50556, 34377, 42777, 56588, 50395, 31449, 29171}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{29400, 8847, 10771, 33315}, new char[]{25520, 38849, 29150, 3661}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 19779), Process.getGidForName("") + 1, new char[]{60681, 23944, 24681, 6950, 27374, 55562, 56456, 10815, 3449, 4797, 16821, 27130, 59902, 12083, 39846, 65506}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-513955617};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 46038), 1133 - TextUtils.lastIndexOf("", '0', 0), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 2004935457, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1031;
                int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr8 = $$a;
                byte b15 = bArr8[5];
                byte b16 = bArr8[7];
                Object[] objArr24 = new Object[1];
                c(b15, b16, (short) (b16 | 140), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(absoluteGravity, packedPositionType2, longPressTimeout, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (Process.myTid() >> 22)), 1117 - (ViewConfiguration.getTouchSlop() >> 8), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int iRed2 = Color.red(0) + 1031;
                int iMyTid2 = 15 - (Process.myTid() >> 22);
                byte b17 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b17, (byte) (b17 | 52), (short) DerHeader.TAG_CLASS_PRIVATE, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, iRed2, iMyTid2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{29400, 8847, 10771, 33315}, new char[]{60663, 58251, 36748, 27659}, (char) View.getDefaultSize(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama6).substring(9, 10).codePointAt(0) - 32, new char[]{43675, 50389, 50723, 54390, 61909, 36276, 26072, 32873, 61714, 51479, 26514, 26023, 24195, 27764, 36894, 61615, 57817, 13034, 39520, 40217, 14769, 14045}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{29400, 8847, 10771, 33315}, new char[]{63732, 12836, 48458, 51785}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18876), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1244800237, new char[]{62966, 49225, 52279, 7493, 12505, 6220, 17999, 62592, 30862, 5788, 14574, 54076, 5889, 54804, 34362}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int gidForName = 1030 - Process.getGidForName("");
                    int i25 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                    byte[] bArr9 = $$a;
                    byte b18 = bArr9[5];
                    byte b19 = bArr9[7];
                    Object[] objArr29 = new Object[1];
                    c(b18, b19, (short) (b19 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cKeyCodeFromString, gidForName, i25, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0');
                    int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte[] bArr10 = $$a;
                    byte b20 = bArr10[5];
                    byte b21 = bArr10[7];
                    Object[] objArr30 = new Object[1];
                    c(b20, b21, (short) (b21 | 140), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, iLastIndexOf, modifierMetaStateMask, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[3])[0];
        if (i27 == i26) {
            int i28 = IconCompatParcelizer + 71;
            write = i28 % 128;
            int i29 = i28 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[3])[0];
            int i32 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i33 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 808414797);
            int i34 = i30 + ((((~((-596859349) | i33)) | 579867028) * (-241)) - 360450356) + (((~(i33 | (-16992321))) | (-932446207)) * 241);
            int i35 = i34 ^ (i34 << 13);
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr31[2])[0] = i36 ^ (i36 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                int i37 = IconCompatParcelizer + 53;
                write = i37 % 128;
                int i38 = i37 % 2;
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i27];
        int i39 = i27 - 1;
        iArr[i39] = 1;
        Toast.makeText((Context) null, iArr[((i27 * i39) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i40 = ((int[]) objArr[2])[0];
        int i41 = ((int[]) objArr[3])[0];
        int i42 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i43 = ~((-916599586) | (~iIdentityHashCode));
        int i44 = i40 + (((-1051916216) | i43 | (~(916599585 | iIdentityHashCode))) * (-338)) + 1178884729 + (((~(iIdentityHashCode | (-135316631))) | i43) * 338);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr32[2])[0] = i46 ^ (i46 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0096, code lost:
    
        if (r1 != (((1385593784 + ((r6 | r7) * 1150)) + (((~((-2019432299) | r4)) | r7) * (-575))) + (((~(r2 | (-303520968))) | (~(r4 | 303520967))) * 575))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0098, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.write + 13;
        com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.IconCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        r1 = (-89133666) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00af, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        if (r1 == (((((~(1276224847 | r4)) | (-1451798328)) * 398) + 268984488) + (((~((~r4) | 1276224847)) | (-1451798328)) * 398))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if (r1 == ((1489033446 + (((~(1003890274 | r4)) | (-173902732)) * (-983))) + (((~(r4 | (-173902732))) | 173277698) * 983))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r4 = ~r2;
        r6 = ~((-303520968) | r4);
        r7 = ~(2019432298 | r2);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.IconCompatParcelizer
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.write = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L38
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r9)
            r5 = 1276224847(0x4c11a54f, float:3.8180156E7)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = -1451798328(0xffffffffa97750c8, float:-5.4915084E-14)
            r6 = r6 | r7
            int r6 = r6 * 398
            r8 = 268984488(0x100860a8, float:2.6895732E-29)
            int r6 = r6 + r8
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r4 = r4 | r7
            int r4 = r4 * 398
            int r6 = r6 + r4
            if (r1 != r6) goto La6
            goto L61
        L38:
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r9)
            int r4 = ~r4
            r5 = 1003890274(0x3bd62662, float:0.0065353373)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = -173902732(0xfffffffff5a27474, float:-4.118721E32)
            r5 = r5 | r6
            int r5 = r5 * (-983)
            r7 = 1489033446(0x58c0d8e6, float:1.6963024E15)
            int r7 = r7 + r5
            r4 = r4 | r6
            int r4 = ~r4
            r5 = 173277698(0xa540202, float:1.0207806E-32)
            r4 = r4 | r5
            int r4 = r4 * 983
            int r7 = r7 + r4
            if (r1 != r7) goto La6
        L61:
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r9)
            int r4 = ~r2
            r5 = -303520968(0xffffffffede8a338, float:-8.99973E27)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = 2019432298(0x785e176a, float:1.80182E34)
            r7 = r7 | r2
            int r7 = ~r7
            r6 = r6 | r7
            int r6 = r6 * 1150
            r8 = 1385593784(0x52967bb8, float:3.2316038E11)
            int r8 = r8 + r6
            r6 = -2019432299(0xffffffff87a1e895, float:-2.4361287E-34)
            r6 = r6 | r4
            int r6 = ~r6
            r6 = r6 | r7
            int r6 = r6 * (-575)
            int r8 = r8 + r6
            r2 = r2 | r5
            int r2 = ~r2
            r5 = 303520967(0x12175cc7, float:4.7761556E-28)
            r4 = r4 | r5
            int r4 = ~r4
            r2 = r2 | r4
            int r2 = r2 * 575
            int r8 = r8 + r2
            if (r1 != r8) goto La5
            super.onResume()
            int r1 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.write
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.IconCompatParcelizer = r2
            int r1 = r1 % r0
            return
        La5:
            throw r3
        La6:
            r1 = -89133666(0xfffffffffaafed9e, float:-4.567357E35)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i2 != 959287048 + ((~((~iMyTid) | (-1098425370))) * (-116)) + ((478218694 | iMyTid) * 116) + (((~(iMyTid | 1308206237)) | 268437826) * 116)) {
            int i3 = write + 107;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            int[] iArr = new int[1054894311];
            iArr[1054894310] = 1;
            int i5 = 1683756938 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i6 != 887505238 + (((~((~iIdentityHashCode) | (-67192482))) | 1783103812) * (-591)) + ((iIdentityHashCode | (-67192482)) * 591)) {
            throw new RuntimeException("-792560703");
        }
        super.onStart();
        int i7 = write + 85;
        IconCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != 501467944 + (((~(1161730866 | iIdentityHashCode)) | 314572873) * 576) + (((~((~iIdentityHashCode) | 1476303739)) | android.R.color.holo_blue_light) * 576) + 805348416) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i5 = (~(1738645176 | iIdentityHashCode2)) | 268960065;
            int i6 = ~((~iIdentityHashCode2) | (-1098947609));
            if (i4 != 1027191422 + ((i5 | i6) * (-470)) + (((~(iIdentityHashCode2 | 2007605241)) | i6) * 470)) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i8 = ~iUptimeMillis;
        if (i7 != 767966968 + (((-1783038148) | i8) * (-369)) + (((~((-347135797) | i8)) | (-2063047128)) * (-369)) + (((~(iUptimeMillis | 347135796)) | (-2130173944) | (~(i8 | (-280008981)))) * 369)) {
            int i9 = write + 5;
            IconCompatParcelizer = i9 % 128;
            if (i9 % 2 == 0) {
                int[] iArr = new int[1026928818];
                iArr[1026928817] = 1;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1026928818];
                iArr2[1026928817] = 1;
                int i10 = 980650770 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i11 = write + 17;
            IconCompatParcelizer = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 5 / 4;
            }
        }
        super.onCreate(bundle);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        OldDaySecurityActivity oldDaySecurityActivity = (OldDaySecurityActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        write = i2 % 128;
        int i3 = i2 % 2;
        oldDaySecurityActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = write + 5;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityActivity oldDaySecurityActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 15;
        write = i3 % 128;
        int i4 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i2 + 1;
            write = i5 % 128;
            int i6 = i5 % 2;
            oldDaySecurityActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            oldDaySecurityActivity.IconCompatParcelizer();
            oldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ((Camera2CameraControlImplExternalSyntheticLambda4) oldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            oldDaySecurityActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(oldDaySecurityActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        } else {
            oldDaySecurityActivity.IconCompatParcelizer();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = write + 7;
        IconCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        OldDaySecurityActivity oldDaySecurityActivity = (OldDaySecurityActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 115;
        write = i3 % 128;
        int i4 = i3 % 2;
        getStringOrNull getstringornull = oldDaySecurityActivity.asBinder;
        if (getstringornull != null) {
            int i5 = i2 + 65;
            write = i5 % 128;
            if (i5 % 2 != 0) {
                getstringornull.dismiss();
                throw null;
            }
            getstringornull.dismiss();
        }
        AddKpjActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = AddKpjActivity.INSTANCE;
        AddKpjActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(oldDaySecurityActivity);
        Unit unit = Unit.INSTANCE;
        int i6 = IconCompatParcelizer + 125;
        write = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final OldDaySecurityActivity oldDaySecurityActivity, OldDaySecurityMenu oldDaySecurityMenu) {
        String str;
        AvailabilityMenuItem availabilityMenuItem;
        List<AvailabilityMenuItem> list;
        Object next;
        AvailabilityMenuItem availabilityMenuItem2;
        List<AvailabilityMenuItem> list2;
        Object next2;
        AvailabilityMenuItem availabilityMenuItem3;
        List<AvailabilityMenuItem> list3;
        Iterator it;
        Object next3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(oldDaySecurityMenu, "");
        int i2 = oldDaySecurityMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String imageUrl = null;
        if (i2 == TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            setCurrentRunnable setcurrentrunnable = (setCurrentRunnable) oldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (setcurrentrunnable == null || (list3 = setcurrentrunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                availabilityMenuItem3 = null;
            } else {
                int i3 = IconCompatParcelizer + 85;
                write = i3 % 128;
                if (i3 % 2 != 0) {
                    it = list3.iterator();
                    int i4 = 21 / 0;
                } else {
                    it = list3.iterator();
                }
                do {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next3).getMenuCode(), "JM001"));
                availabilityMenuItem3 = (AvailabilityMenuItem) next3;
            }
            if (Intrinsics.areEqual(availabilityMenuItem3 != null ? availabilityMenuItem3.getActive() : null, "Y")) {
                OldDaySecurityBalanceCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = OldDaySecurityBalanceCheckActivity.INSTANCE;
                OldDaySecurityBalanceCheckActivity.Companion.b(oldDaySecurityActivity);
            } else {
                if (!Intrinsics.areEqual(availabilityMenuItem3 != null ? availabilityMenuItem3.getImageUrl() : null, "")) {
                    if (availabilityMenuItem3 != null) {
                        int i5 = write + 99;
                        IconCompatParcelizer = i5 % 128;
                        int i6 = i5 % 2;
                        imageUrl = availabilityMenuItem3.getImageUrl();
                    }
                    oldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(String.valueOf(imageUrl));
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, availabilityMenuItem3.getInformationMessage(), null);
                }
            }
            str = "view_balance_jht";
        } else if (i2 == TuitionPaymentFragmentbindingInflater1) {
            OldDaySecuritySimulationActivity.Companion bVar = OldDaySecuritySimulationActivity.INSTANCE;
            OldDaySecuritySimulationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity);
            str = "view_simulation_jht";
        } else if (i2 == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setCurrentRunnable setcurrentrunnable2 = (setCurrentRunnable) oldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (setcurrentrunnable2 == null || (list2 = setcurrentrunnable2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                availabilityMenuItem2 = null;
            } else {
                Iterator<T> it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next2).getMenuCode(), "JM003"));
                availabilityMenuItem2 = (AvailabilityMenuItem) next2;
            }
            if (Intrinsics.areEqual(availabilityMenuItem2 != null ? availabilityMenuItem2.getActive() : null, "Y")) {
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                String str2 = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -324551822, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 324551830);
                getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                String str3 = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -2141894135, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2141894140);
                getMaxImages getmaximages3 = getMaxImages.INSTANCE;
                String strRun = getMaxImages.run();
                if (Intrinsics.areEqual(str2, "true")) {
                    ((getStreamUseCaseSupportedCombinationList) oldDaySecurityActivity.asInterface.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL", "");
                    String string = ((getStreamUseCaseSupportedCombinationList) oldDaySecurityActivity.asInterface.getValue()).asBinder.getString("STATUS_ANTRIAN_ONLINE_URL", "");
                    String string2 = ((getStreamUseCaseSupportedCombinationList) oldDaySecurityActivity.asInterface.getValue()).asBinder.getString("ANTRIAN_ONLINE_MESSAGE", "");
                    if (Intrinsics.areEqual(string, "0")) {
                        ((Camera2CameraControlImplExternalSyntheticLambda4) oldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    } else if (Intrinsics.areEqual(string, "-2")) {
                        String string3 = oldDaySecurityActivity.getString(R.string.action_information);
                        Intrinsics.checkNotNullExpressionValue(string3, "");
                        String string4 = oldDaySecurityActivity.getString(R.string.label_add_kpj_simple);
                        Intrinsics.checkNotNullExpressionValue(string4, "");
                        String string5 = oldDaySecurityActivity.getString(R.string.action_return);
                        Intrinsics.checkNotNullExpressionValue(string5, "");
                        Function0 function0 = new Function0() { // from class: getMaxAfRegionCount
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
                                return (Unit) OldDaySecurityActivity.b(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 478074182, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), objArr, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -478074179);
                            }
                        };
                        Function0 function1 = new Function0() { // from class: getInteropConfig
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
                                return (Unit) OldDaySecurityActivity.b(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -512749725, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), objArr, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 512749727);
                            }
                        };
                        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_blue, string3, string2, string4, function0, string5, function1);
                        oldDaySecurityActivity.asBinder = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        FragmentManager supportFragmentManager = oldDaySecurityActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, string2, null);
                    }
                } else {
                    int i7 = write + 103;
                    IconCompatParcelizer = i7 % 128;
                    int i8 = i7 % 2;
                    lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.INSTANCE;
                    lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion.TuitionPaymentFragmentbindingInflater1(str3, "Buka Lapak Asik");
                    oldDaySecurityActivity.b = lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1;
                    FragmentManager supportFragmentManager2 = oldDaySecurityActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                    if (supportFragmentManager2.findFragmentByTag(lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager2, lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl = oldDaySecurityActivity.b;
                    if (lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl != null) {
                        lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl.a = oldDaySecurityActivity.new TuitionPaymentFragmentbindingInflater1(strRun);
                    }
                }
            } else {
                if (!Intrinsics.areEqual(availabilityMenuItem2 != null ? availabilityMenuItem2.getImageUrl() : null, "")) {
                    oldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(String.valueOf(availabilityMenuItem2 != null ? availabilityMenuItem2.getImageUrl() : null));
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, availabilityMenuItem2.getInformationMessage(), null);
                }
            }
            str = "claim_jht";
        } else if (i2 == f582a) {
            ClaimTrackingActivity.Companion tuitionPaymentFragmentbindingInflater1 = ClaimTrackingActivity.INSTANCE;
            ClaimTrackingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity);
            str = "tracking_claim_jht";
        } else if (i2 == b) {
            int i9 = write + 65;
            IconCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
            setCurrentRunnable setcurrentrunnable3 = (setCurrentRunnable) oldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (setcurrentrunnable3 == null || (list = setcurrentrunnable3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                availabilityMenuItem = null;
            } else {
                Iterator<T> it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next).getMenuCode(), "JM005"));
                availabilityMenuItem = (AvailabilityMenuItem) next;
            }
            if (Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getActive() : null, "Y")) {
                OldDaySecurityCheckRsjhtActivity.Companion bVar2 = OldDaySecurityCheckRsjhtActivity.INSTANCE;
                OldDaySecurityCheckRsjhtActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(oldDaySecurityActivity);
            } else {
                if (Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null, "")) {
                    int i11 = write + 83;
                    IconCompatParcelizer = i11 % 128;
                    if (i11 % 2 == 0) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, availabilityMenuItem.getInformationMessage(), null);
                        int i12 = 75 / 0;
                    } else {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, availabilityMenuItem.getInformationMessage(), null);
                    }
                } else {
                    oldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(String.valueOf(availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null));
                }
            }
            str = "view_rsjht";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_jht_program", str));
        Intrinsics.checkNotNullParameter(oldDaySecurityActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(OldDaySecurityActivity oldDaySecurityActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            oldDaySecurityActivity.MediaBrowserCompat();
            int i2 = IconCompatParcelizer + 125;
            write = i2 % 128;
            int i3 = i2 % 2;
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                oldDaySecurityActivity.IconCompatParcelizer();
                String str = ((ComponentActivityExternalSyntheticLambda10) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str.length() == 0) {
                    int i4 = IconCompatParcelizer + 41;
                    write = i4 % 128;
                    if (i4 % 2 != 0) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, "Kode pengajuan tidak ditemukan", null);
                        obj.hashCode();
                        throw null;
                    }
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, "Kode pengajuan tidak ditemukan", null);
                } else {
                    List<ClaimSegmenItem> list = oldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (list.isEmpty()) {
                        int i5 = IconCompatParcelizer + 65;
                        write = i5 % 128;
                        if (i5 % 2 != 0) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, "Data Segemen ".concat(String.valueOf(list.size())), null);
                            int i6 = 86 / 0;
                        } else {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, "Data Segemen ".concat(String.valueOf(list.size())), null);
                        }
                    } else if (list.size() == 1) {
                        int i7 = IconCompatParcelizer + 107;
                        write = i7 % 128;
                        int i8 = i7 % 2;
                        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
                        ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, list.get(0).b, str);
                    } else {
                        ClaimChooseMembershipActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ClaimChooseMembershipActivity.INSTANCE;
                        ClaimChooseMembershipActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oldDaySecurityActivity, list, str);
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                oldDaySecurityActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(oldDaySecurityActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            } else {
                oldDaySecurityActivity.IconCompatParcelizer();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = write + 45;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit cancelAll() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ setCurrentRunnable TuitionPaymentFragmentspecialinlinedviewModeldefault3(OldDaySecurityActivity oldDaySecurityActivity) {
        int i = 2 % 2;
        int i2 = write + 91;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            ((access000) oldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            throw null;
        }
        setCurrentRunnable setcurrentrunnableTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((access000) oldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i3 = write + 107;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return setcurrentrunnableTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static /* synthetic */ Unit b(OldDaySecurityActivity oldDaySecurityActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        return (Unit) b(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 637641356, iTuitionPaymentFragmentbindingInflater1, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), new Object[]{oldDaySecurityActivity}, iTuitionPaymentFragmentbindingInflater2, -637641356);
    }

    public static /* synthetic */ setExposureCompensationIndex TuitionPaymentFragmentspecialinlinedviewModeldefault1(OldDaySecurityActivity oldDaySecurityActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        return (setExposureCompensationIndex) b(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 1825723726, iTuitionPaymentFragmentbindingInflater1, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), new Object[]{oldDaySecurityActivity}, iTuitionPaymentFragmentbindingInflater2, -1825723725);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(OldDaySecurityActivity oldDaySecurityActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        return (Unit) b(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), 478074182, iTuitionPaymentFragmentbindingInflater1, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), new Object[]{oldDaySecurityActivity}, iTuitionPaymentFragmentbindingInflater2, -478074179);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(OldDaySecurityActivity oldDaySecurityActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        return (Unit) b(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -512749725, iTuitionPaymentFragmentbindingInflater1, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), new Object[]{oldDaySecurityActivity}, iTuitionPaymentFragmentbindingInflater2, 512749727);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = write + 5;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = write + 73;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void onTransact() {
        INotificationSideChannelStub = 2692527371244468201L;
        INotificationSideChannelDefault = -981105359;
        getInterfaceDescriptor = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, short r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 + 102
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.$$c
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity.$$i(byte, short, short):java.lang.String");
    }
}
