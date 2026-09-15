package com.bpjstku.presentation.promo;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.promo.model.request.OrderMerchant;
import com.bpjstku.data.promo.model.request.SearchMerchant;
import com.bpjstku.databinding.ActivitySearchCoMarketingBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.promo.model.CategoryMerchant;
import com.bpjstku.domain.promo.model.ListMerchant;
import com.bpjstku.presentation.promo.SearchCoMarketingActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.api.internal.zaaq;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.libraries.places.internal.zzpu;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControl;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.FocusMeteringControlExternalSyntheticLambda11;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addCaptureRequestOptionsInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deriveCodec;
import defpackage.getConcurrentCameraSelectors;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getMeteringRect;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl;
import defpackage.lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;
import defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.onSuggestionClick;
import defpackage.refresh;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.triggerAePrecapture;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J;\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0005J#\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0007\u0010\u0017R\u0015\u0010\u001b\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R\u0016\u0010\t\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u0016\u0010\n\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010'R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010.R\u0014\u0010\u000b\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0015\u0010\u0019\u001a\u0002018CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0015\u0010\u001f\u001a\u0002028CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0015\u0010\"\u001a\u0002038CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u00105\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u00104R \u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0002068UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u00108"}, d2 = {"Lcom/bpjstku/presentation/promo/SearchCoMarketingActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySearchCoMarketingBinding;", "LaddCaptureRequestOptionsInternal$TuitionPaymentFragmentbindingInflater1;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "onTransact", "", "p0", "p1", "", "Lcom/bpjstku/data/promo/model/request/SearchMerchant;", "p2", "Lcom/bpjstku/data/promo/model/request/OrderMerchant;", "p3", "TuitionPaymentFragmentbindingInflater1", "(IILjava/util/List;Ljava/util/List;)V", "asBinder", "(Ljava/lang/Integer;)V", "Lrefresh;", "cancel", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LonSuggestionClick;", "cancelAll", "Lcom/bpjstku/domain/promo/model/CategoryMerchant;", "INotificationSideChannelStub", "Lcom/bpjstku/domain/promo/model/CategoryMerchant;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "RemoteActionCompatParcelizer", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "getInterfaceDescriptor", "Ljava/lang/String;", "g", "d", "notify", "I", "", "INotificationSideChannel", "Ljava/util/List;", "LlambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl;", "LlambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl;", "LlambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl;", "LFocusMeteringControlExternalSyntheticLambda11;", "LtriggerAePrecapture;", "()I", "INotificationSideChannelStubProxy", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "INotificationSideChannelDefault"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchCoMarketingActivity extends BindingBaseActivity<ActivitySearchCoMarketingBinding> implements addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 {
    private static long INotificationSideChannelDefault;
    private static char IconCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getItem;
    private static int read;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private CategoryMerchant TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$f = 104;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {32, 1, 70, -122, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 126;
    private static int write = 0;
    private static int connect = 0;
    private static int MediaBrowserCompat = 1;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String g = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String d = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String a = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private int asBinder = 1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private int cancelAll = 10;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private List<SearchMerchant> notify = CollectionsKt.mutableListOf(new SearchMerchant("=", "AKTIF", "STATUS_PROMO"));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<OrderMerchant> INotificationSideChannel = CollectionsKt.listOf(new OrderMerchant("desc", "KODE_PKS"));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl onTransact = new lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: lambdacancelFocusAndMetering13androidxcameracamera2internalFocusMeteringControl
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -693950630;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStub = LazyKt.lazy(new Function0() { // from class: rangeLimit
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.b};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return (FocusMeteringControlExternalSyntheticLambda11) SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -277818914, 277818920, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy RemoteActionCompatParcelizer = LazyKt.lazy(new Function0() { // from class: addFocusMeteringOptions
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i3) | i4)) | (~(i3 | i5));
        int i8 = ~i4;
        int i9 = (~(i8 | i5)) | i3;
        int i10 = (~(i5 | i4)) | (~(i8 | (~i5))) | i3;
        int i11 = i4 + i3 + i6 + ((-737137436) * i2) + ((-1840598144) * i);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i4) - 818937856) + (24099949 * i3) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i6) + (1335885824 * i2) + ((-1946157056) * i) + ((-1593638912) * i12);
        int i14 = (i4 * 1252406331) + 1981669868 + (i3 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i6 * 1252407325) + (i2 * (-1820396076)) + (i * 1320834432) + (i12 * (-447283200));
        switch (i13 + (i14 * i14 * 1511325696)) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 3:
                return b(objArr);
            case 4:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 5:
                int i15 = 2 % 2;
                int i16 = MediaBrowserCompat + 43;
                connect = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 6:
                final SearchCoMarketingActivity searchCoMarketingActivity = (SearchCoMarketingActivity) objArr[0];
                int i18 = 2 % 2;
                FocusMeteringControlExternalSyntheticLambda11.Companion tuitionPaymentFragmentbindingInflater1 = FocusMeteringControlExternalSyntheticLambda11.INSTANCE;
                CodeNamePair codeNamePair = searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                FocusMeteringControlExternalSyntheticLambda11 focusMeteringControlExternalSyntheticLambda11TuitionPaymentFragmentbindingInflater1 = FocusMeteringControlExternalSyntheticLambda11.Companion.TuitionPaymentFragmentbindingInflater1(null, new Function1() { // from class: lambdaenableExternalFlashAeMode4androidxcameracamera2internalFocusMeteringControl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (CodeNamePair) obj};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        return (Unit) SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr2, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1658206525, -1658206521, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                });
                int i19 = connect + 49;
                MediaBrowserCompat = i19 % 128;
                int i20 = i19 % 2;
                return focusMeteringControlExternalSyntheticLambda11TuitionPaymentFragmentbindingInflater1;
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    private static void c(byte b, byte b2, short s, Object[] objArr) {
        int i = 98 - (b2 * 14);
        int i2 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - b];
        int i3 = 52 - b;
        int i4 = -1;
        if (bArr == null) {
            int i5 = (i2 + (-i3)) - 11;
            i2 = i2;
            i = i5;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2 + 1;
            i2 = i6;
            i = (i + (-bArr[i6])) - 11;
        }
    }

    public SearchCoMarketingActivity() {
        final SearchCoMarketingActivity searchCoMarketingActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<refresh>() { // from class: com.bpjstku.presentation.promo.SearchCoMarketingActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, refresh] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ refresh invoke() {
                LifecycleOwner lifecycleOwner = searchCoMarketingActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(refresh.class);
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
        final SearchCoMarketingActivity searchCoMarketingActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<onSuggestionClick>() { // from class: com.bpjstku.presentation.promo.SearchCoMarketingActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, onSuggestionClick] */
            @Override // kotlin.jvm.functions.Function0
            public final onSuggestionClick invoke() {
                ComponentCallbacks componentCallbacks = searchCoMarketingActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(onSuggestionClick.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity searchCoMarketingActivity) {
        int i = 2 % 2;
        int i2 = connect + 67;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        searchCoMarketingActivity.onTransact();
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = MediaBrowserCompat + 85;
        connect = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity searchCoMarketingActivity, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 45;
        connect = i2 % 128;
        int i3 = i2 % 2;
        searchCoMarketingActivity.b = str;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
    }

    public static final /* synthetic */ List a(SearchCoMarketingActivity searchCoMarketingActivity) {
        int i = 2 % 2;
        int i2 = connect + 41;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        int i4 = i2 % 2;
        List<SearchMerchant> list = searchCoMarketingActivity.notify;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 103;
        connect = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ String d(SearchCoMarketingActivity searchCoMarketingActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 113;
        connect = i3 % 128;
        int i4 = i3 % 2;
        String str = searchCoMarketingActivity.b;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 13;
        connect = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Integer num, RecyclerView recyclerView) {
        int i = 2 % 2;
        int i2 = connect + 15;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(recyclerView, "");
        int i4 = this.cancelAll;
        Object[] objArr = {this, Integer.valueOf(iIntValue), Integer.valueOf(i4), this.notify, this.INotificationSideChannel};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1709535975, -1709535973, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i5 = connect + 3;
        MediaBrowserCompat = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySearchCoMarketingBinding> TuitionPaymentFragmentbindingInflater1() {
        SearchCoMarketingActivity$bindingInflater$1 searchCoMarketingActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = connect + 19;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            searchCoMarketingActivity$bindingInflater$1 = SearchCoMarketingActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            int i3 = 12 / 0;
        } else {
            searchCoMarketingActivity$bindingInflater$1 = SearchCoMarketingActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        }
        int i4 = MediaBrowserCompat + 123;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            return searchCoMarketingActivity$bindingInflater$1;
        }
        throw null;
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
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) i2;
                    byte b2 = (byte) (b - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.blue(0) + 8328), View.resolveSizeAndState(0, 0, 0) + 1235, ExpandableListView.getPackedPositionChild(0L) + 36, -653973969, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2763, (ViewConfiguration.getTapTimeout() >> 16) + 14, 1504416861, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getEdgeSlop() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 252, 22 - (ViewConfiguration.getTapTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - Color.green(0)), 2891 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (INotificationSideChannelDefault ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) read) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) IconCompatParcelizer) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 117;
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

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int size;
            String strValueOf = String.valueOf(editable);
            int length = strValueOf.length() - 1;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare((int) strValueOf.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            if (strValueOf.subSequence(i2, length + 1).toString().length() == 0) {
                SearchCoMarketingActivity.TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity.this, "");
                List listA = SearchCoMarketingActivity.a(SearchCoMarketingActivity.this);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (Intrinsics.areEqual(((SearchMerchant) obj).getKey(), "nama_produk")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!Intrinsics.areEqual(SearchCoMarketingActivity.d(SearchCoMarketingActivity.this), "") || arrayList2.isEmpty() || (size = SearchCoMarketingActivity.a(SearchCoMarketingActivity.this).size()) < 0) {
                    return;
                }
                while (!Intrinsics.areEqual(((SearchMerchant) SearchCoMarketingActivity.a(SearchCoMarketingActivity.this).get(i)).getKey(), "nama_produk")) {
                    if (i == size) {
                        return;
                    } else {
                        i++;
                    }
                }
                SearchCoMarketingActivity.a(SearchCoMarketingActivity.this).remove(i);
                SearchCoMarketingActivity.TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity.this);
                return;
            }
            SearchCoMarketingActivity.TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity.this, String.valueOf(editable));
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivitySearchCoMarketingBinding activitySearchCoMarketingBinding = (ActivitySearchCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activitySearchCoMarketingBinding.tvLocation.setOnClickListener(new View.OnClickListener() { // from class: cancelFocusAndMeteringInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchCoMarketingActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        activitySearchCoMarketingBinding.tvCategory.setOnClickListener(new getMeteringRect(this));
        activitySearchCoMarketingBinding.edtSearch.setOnTouchListener(new View.OnTouchListener() { // from class: completeActionFuture
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchCoMarketingActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        activitySearchCoMarketingBinding.edtSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: cancelAfAeTrigger
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activitySearchCoMarketingBinding, i2);
            }
        });
        ((ActivitySearchCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtSearch.addTextChangedListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Function1() { // from class: cancelFocusAndMeteringWithoutAsyncResult
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchCoMarketingActivity.b(this.TuitionPaymentFragmentbindingInflater1, (ListMerchant) obj);
            }
        };
        int i2 = MediaBrowserCompat + 33;
        connect = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final SearchCoMarketingActivity searchCoMarketingActivity = (SearchCoMarketingActivity) objArr[0];
        int i = 2 % 2;
        SearchCoMarketingActivity searchCoMarketingActivity2 = searchCoMarketingActivity;
        ((refresh) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(searchCoMarketingActivity2, new Observer() { // from class: isValid
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoMarketingActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((onSuggestionClick) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).f1311a.observe(searchCoMarketingActivity2, new Observer() { // from class: isAfModeSupported
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoMarketingActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((refresh) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).g.observe(searchCoMarketingActivity2, new Observer() { // from class: shouldTriggerAF
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((refresh) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(searchCoMarketingActivity2, new Observer() { // from class: getDefaultAfMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = MediaBrowserCompat + 123;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003d A[PHI: r1
  0x003d: PHI (r1v7 refresh) = (r1v6 refresh), (r1v17 refresh) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        final refresh refreshVar;
        int i = 2 % 2;
        int i2 = connect + 107;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact();
            refreshVar = (refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            int i3 = 14 / 0;
            if (!(refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue() instanceof VirtualCameraAdapter1.asBinder)) {
                MutableLiveData<VirtualCameraAdapter1<List<CategoryMerchant>>> mutableLiveData = refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(refreshVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new BaseRequest())));
                final Function1 function1 = new Function1() { // from class: enableExternalFlashAeMode
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVar, (List) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: disableAutoCancel
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: canResolve
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return refresh.g(refreshVar, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ExposureControl
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else {
            onTransact();
            refreshVar = (refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (!(refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue() instanceof VirtualCameraAdapter1.asBinder)) {
                MutableLiveData<VirtualCameraAdapter1<List<CategoryMerchant>>> mutableLiveData2 = refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(refreshVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new BaseRequest())));
                final Function1 function3 = new Function1() { // from class: enableExternalFlashAeMode
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVar, (List) obj);
                    }
                };
                logToString logtostring2 = new logToString() { // from class: disableAutoCancel
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function3.invoke(obj);
                    }
                };
                final Function1 function4 = new Function1() { // from class: canResolve
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return refresh.g(refreshVar, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: ExposureControl
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function4.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        }
        ((onSuggestionClick) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = connect + 53;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 105;
        connect = i2 % 128;
        int i3 = i2 % 2;
        lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) this.cancel.getValue();
        Camera2CameraControl camera2CameraControl = lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.f253a;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControl.b;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        camera2CameraControl.TuitionPaymentFragmentbindingInflater1 = true;
        lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.asInterface.addOnScrollListener(lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.f253a);
        ((refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b(this.asBinder, this.cancelAll, this.notify, this.INotificationSideChannel);
        int i4 = MediaBrowserCompat + 83;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final SearchCoMarketingActivity searchCoMarketingActivity = (SearchCoMarketingActivity) objArr[0];
        int i = 2 % 2;
        ((refresh) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (List) objArr[3], (List) objArr[4]).observe(searchCoMarketingActivity, new Observer() { // from class: lambdacancelFocusAndMeteringInternal14androidxcameracamera2internalFocusMeteringControl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = connect + 117;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        SearchCoMarketingActivity searchCoMarketingActivity = this;
        Intrinsics.checkNotNullParameter(searchCoMarketingActivity, "");
        searchCoMarketingActivity.getWindow().addFlags(8192);
        ((ActivitySearchCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.appbar_co_marketing));
        ((ActivitySearchCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: getDefaultAspectRatio
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        ((ActivitySearchCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).edtSearch.requestFocus();
        RecyclerView recyclerView = ((ActivitySearchCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addItemDecoration(new getConcurrentCameraSelectors(2));
        recyclerView.setAdapter((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) this.cancel.getValue());
        lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) this.cancel.getValue();
        lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((ActivitySearchCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant);
        lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.g = this;
        int i2 = connect + 123;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.promo.SearchCoMarketingActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/promo/SearchCoMarketingActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) SearchCoMarketingActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 85;
        connect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.asBinder;
        int i5 = this.cancelAll;
        Object[] objArr = {this, Integer.valueOf(i4), Integer.valueOf(i5), this.notify, this.INotificationSideChannel};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1709535975, -1709535973, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i6 = connect + 21;
        MediaBrowserCompat = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 15, bArr[1], bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, keyRepeatDelay, longPressTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = MediaBrowserCompat + 77;
            connect = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                int defaultSize = 1755 - View.getDefaultSize(0, 0);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c(bArr2[7], bArr2[1], (short) ($$b & 165), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, defaultSize, minimumFlingVelocity, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iNextInt = new Random().nextInt(1757979474);
            int i4 = (-120790168) + (((~((-979988212) | iNextInt)) | 306187842) * 345) + (((~((-979988212) | (~iNextInt))) | (-1073573628)) * 345) + ((~(iNextInt | (-306187843))) * 345) + 217404131;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{45894, 6724, 32332, 59018}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_too_far).substring(0, 25).length() + 35429), Color.red(0), new char[]{39111, 10625, 51133, 49170, 4868, 15959, 49935, 3520, 17654, 42907, 39598, 10286, 38403, 24791, 36689, 11155}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{19783, 2011, 5517, 3055}, (char) (Gravity.getAbsoluteGravity(0, 0) + 61205), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_1).substring(1, 3).length() - 2, new char[]{60001, 30322, 53545, 20533, 9072, 57302, 4637, 58438, 594, 63590, 43662, 31216, 55231, 9984, 33535, 42876}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-907679954};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42049), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - (Process.myTid() >> 22), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 217404131, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 29944);
                    int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c(bArr3[7], bArr3[1], (short) ($$b & 165), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize2, iMakeMeasureSpec, keyRepeatDelay2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{3100, 13019, 8770, 7162}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_instruction_text).substring(0, 32).codePointAt(3) - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, new char[]{57343, 53239, 4392, 30633, 5946, 31207, 17836, 59093, 50545, 43401, 47411, 24023, 56452, 63449, 49843, 20671, 50104, 22634, 31553, 5561, 33034, 30065}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{11510, 23459, 47444, 34080}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_expiry_date).substring(16, 17).codePointAt(0) + 8300), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 1415291585, new char[]{46731, 32001, 18223, 18248, 11658, 64678, 17804, 63111, 30921, 41338, 23822, 58554, 44035, 9262, 12280}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                        int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        c(bArr4[7], bArr4[1], (short) ($$b & 472), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, i7, iLastIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                        int i8 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                        int iAlpha = Color.alpha(0) + 23;
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((byte) 15, bArr5[1], bArr5[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i8, iAlpha, 986134021, false, (String) objArr12[0], null);
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
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int i12 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 371062394);
        int i13 = i11 + (((~((-529711563) | i12)) | 219168842) * (-241)) + 1886659854 + (((~(i12 | (-310542721))) | (-536277979)) * 241);
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0');
            int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr6 = $$a;
            Object[] objArr14 = new Object[1];
            c(bArr6[7], bArr6[1], (short) 140, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode, iLastIndexOf2, scrollBarFadeDuration, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{3100, 13019, 8770, 7162}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.shipping_cb_message).substring(0, 3).length() - 3, new char[]{57343, 53239, 4392, 30633, 5946, 31207, 17836, 59093, 50545, 43401, 47411, 24023, 56452, 63449, 49843, 20671, 50104, 22634, 31553, 5561, 33034, 30065}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{11510, 23459, 47444, 34080}, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 8377), ExpandableListView.getPackedPositionGroup(0L) + 1415291692, new char[]{46731, 32001, 18223, 18248, 11658, 64678, 17804, 63111, 30921, 41338, 23822, 58554, 44035, 9262, 12280}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int iAlpha2 = Color.alpha(0) + 1031;
            int iMakeMeasureSpec2 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr7 = $$a;
            Object[] objArr17 = new Object[1];
            c(bArr7[7], bArr7[1], (short) ($$b & 165), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar, iAlpha2, iMakeMeasureSpec2, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int iAlpha3 = Color.alpha(0) + 1031;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                byte b = (byte) ($$b & 181);
                byte b2 = $$a[7];
                Object[] objArr18 = new Object[1];
                c(b, b2, (short) (b2 | 192), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iAlpha3, iCombineMeasuredStates, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr19[3])[0];
            int i17 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i18 = ~(((int) Process.getStartElapsedRealtime()) | (-815080649));
            int i19 = ((((-1068872955) | i18) * (-196)) - 1300073227) + ((i18 | 253792306) * 196) + 2136256391;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr[2])[0] = i21 ^ (i21 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{45894, 6724, 32332, 59018}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).length() + 35452), ExpandableListView.getPackedPositionGroup(0L), new char[]{39111, 10625, 51133, 49170, 4868, 15959, 49935, 3520, 17654, 42907, 39598, 10286, 38403, 24791, 36689, 11155}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{19783, 2011, 5517, 3055}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 61205), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), new char[]{60001, 30322, 53545, 20533, 9072, 57302, 4637, 58438, 594, 63590, 43662, 31216, 55231, 9984, 33535, 42876}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-907679954};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46039 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1134 - TextUtils.indexOf("", ""), 18 - View.MeasureSpec.makeMeasureSpec(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 2136256391, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                byte[] bArr8 = $$a;
                Object[] objArr24 = new Object[1];
                c(bArr8[7], bArr8[1], (short) 140, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollDefaultDelay, offsetAfter, threadPriority, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45993), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1117, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int mirror = AndroidCharacter.getMirror('0') + 983;
                int i22 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b3 = (byte) ($$b & 181);
                byte b4 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(b3, b4, (short) (b4 | 192), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, mirror, i22, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{3100, 13019, 8770, 7162}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_phone_no_invalid_optional).substring(28, 30).length() - 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{57343, 53239, 4392, 30633, 5946, 31207, 17836, 59093, 50545, 43401, 47411, 24023, 56452, 63449, 49843, 20671, 50104, 22634, 31553, 5561, 33034, 30065}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{11510, 23459, 47444, 34080}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).length() + 8375), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_others).substring(0, 6).length() + 1415291686, new char[]{46731, 32001, 18223, 18248, 11658, 64678, 17804, 63111, 30921, 41338, 23822, 58554, 44035, 9262, 12280}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int keyRepeatDelay3 = 1031 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
                    byte[] bArr9 = $$a;
                    Object[] objArr28 = new Object[1];
                    c(bArr9[7], bArr9[1], (short) ($$b & 165), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetBefore, keyRepeatDelay3, iIndexOf, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int i23 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                    byte[] bArr10 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr10[7], bArr10[1], (short) 140, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, maximumFlingVelocity, i23, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i24 = MediaBrowserCompat + 97;
                connect = i24 % 128;
                int i25 = i24 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[3])[0];
        if (i27 == i26) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i31 = i28 + (-1455166357) + (((~((~startElapsedRealtime) | (-539038473))) | (~((-75538583) | startElapsedRealtime))) * (-302)) + ((~((-539038473) | startElapsedRealtime)) * (-604)) + (((~(startElapsedRealtime | (-614577055))) | (-934395807)) * 302);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr30[2])[0] = i33 ^ (i33 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i27];
        int i34 = i27 - 1;
        iArr[i34] = 1;
        Toast.makeText((Context) null, iArr[((i27 * i34) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr[2])[0];
        int i36 = ((int[]) objArr[3])[0];
        int i37 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iMyUid = Process.myUid();
        int i38 = i35 + (-1490412406) + ((~(224912855 | iMyUid)) * (-301)) + (((~((-19375576) | iMyUid)) | (~((~iMyUid) | 224904594))) * (-301)) + (((~(iMyUid | (-224904595))) | (-19375576)) * 301);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
        int i41 = connect + 83;
        MediaBrowserCompat = i41 % 128;
        int i42 = i41 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        if (r1 != ((((~((~r2) | (-1075840017))) * 130) - 82735060) + (((~(r2 | (-1075840017))) | 629584008) * 130))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c3, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect + 31;
        com.bpjstku.presentation.promo.SearchCoMarketingActivity.MediaBrowserCompat = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d7, code lost:
    
        throw new java.lang.RuntimeException("743022829");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00df, code lost:
    
        throw new java.lang.RuntimeException("-658728854");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0060, code lost:
    
        if (r1 == (((1270702316 + ((~((-1107368962) | r4)) * (-301))) + (((~(1802731201 | r4)) | (~((~r4) | 972743658))) * (-301))) + (((~(r4 | (-972743659))) | 1802731201) * 301))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009b, code lost:
    
        if (r1 == (((1168966376 + (((~(1798775158 | r5)) | 277382793) * 168)) + ((~((-277382794) | r4)) * 168)) + (((~(r4 | 2076157951)) | ((~(r5 | (-968787616))) | 691404822)) * 168))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) android.os.SystemClock.uptimeMillis();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.SearchCoMarketingActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b1, code lost:
    
        if (r1 != (((((~(1774064987 | r4)) | (~(r2 | 58153656))) * 959) - 1259854841) + (((~(r2 | 1774064987)) | (~(r4 | 58153656))) * 959))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b3, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect + 7;
        com.bpjstku.presentation.promo.SearchCoMarketingActivity.MediaBrowserCompat = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bf, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
    
        r1 = (-1931097614) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cc, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        throw new java.lang.RuntimeException("1769959682");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0053, code lost:
    
        if (r1 == (((1125317536 + (((~((-338011473) | r5)) | (~(1167999015 | r5))) * (-867))) + ((((~((-338011473) | r4)) | 270640464) | (~(1167999015 | r4))) * (-1734))) + (((~(r4 | 1438639479)) | ((~(r5 | (-270640465))) | (~((-67371009) | r4)))) * 867))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0080, code lost:
    
        if (r1 == ((((-1315882576) + (((-6423553) | r4) * (-381))) + (((~((~r4) | (-1080731352))) | 1318628055) * 381)) - 1847593984)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0082, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = new java.util.Random().nextInt();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.SearchCoMarketingActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 21;
        connect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i6 = 1241479188 + (((-851442474) | i5) * 614);
        int i7 = ~i5;
        if (i4 != i6 + (((~((-216248558) | i7)) | 205521092 | (~((-1046236101) | i7))) * (-1228)) + (((~(i7 | (-840715009))) | (~((-10727466) | i7))) * 614)) {
            int i8 = 1685229040 % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i10 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingaddress_empty).substring(16, 17).length() + 995405625);
        if (i9 != 159999548 + ((2128465917 | i10) * 184) + (((~(i10 | 411945933)) | 1717128637) * 184)) {
            int i11 = 939128032 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i12 = connect + 123;
        MediaBrowserCompat = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ boolean b(SearchCoMarketingActivity searchCoMarketingActivity) {
        boolean z;
        int i = 2 % 2;
        int i2 = connect + 69;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            searchCoMarketingActivity.getWindow().setSoftInputMode(2);
            z = true;
        } else {
            searchCoMarketingActivity.getWindow().setSoftInputMode(5);
            z = false;
        }
        int i3 = connect + 117;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(SearchCoMarketingActivity searchCoMarketingActivity, ListMerchant listMerchant) {
        int i = 2 % 2;
        int i2 = connect + 87;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listMerchant, "");
        DetailPromoActivity.Companion companion = DetailPromoActivity.INSTANCE;
        DetailPromoActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(searchCoMarketingActivity, listMerchant.g, false, null);
        Unit unit = Unit.INSTANCE;
        int i4 = connect + 79;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SearchCoMarketingActivity searchCoMarketingActivity, View view) {
        int i = 2 % 2;
        int i2 = connect + 49;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            searchCoMarketingActivity.finish();
            ViewPortBuilder.b();
            int i4 = connect + 7;
            MediaBrowserCompat = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity searchCoMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        int i2 = connect + 123;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        int i4 = i2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String string = searchCoMarketingActivity.getString(R.string.error_error_occured);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                return;
            }
            return;
        }
        int i5 = i3 + 63;
        connect = i5 % 128;
        int i6 = i5 % 2;
        ((triggerAePrecapture) searchCoMarketingActivity.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List<CategoryMerchant>) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i7 = MediaBrowserCompat + 123;
        connect = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity searchCoMarketingActivity, View view) {
        int i = 2 % 2;
        int i2 = connect + 77;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            FocusMeteringControlExternalSyntheticLambda11 focusMeteringControlExternalSyntheticLambda11 = (FocusMeteringControlExternalSyntheticLambda11) searchCoMarketingActivity.INotificationSideChannelStub.getValue();
            FragmentManager supportFragmentManager = searchCoMarketingActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(focusMeteringControlExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = MediaBrowserCompat + 19;
                connect = i4 % 128;
                if (i4 % 2 != 0) {
                    focusMeteringControlExternalSyntheticLambda11.show(supportFragmentManager, focusMeteringControlExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                focusMeteringControlExternalSyntheticLambda11.show(supportFragmentManager, focusMeteringControlExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchCoMarketingActivity searchCoMarketingActivity, ActivitySearchCoMarketingBinding activitySearchCoMarketingBinding, int i) {
        Object next;
        int i2 = 2 % 2;
        int i3 = 0;
        if (i != 3) {
            return false;
        }
        View currentFocus = searchCoMarketingActivity.getCurrentFocus();
        if (currentFocus != null) {
            int i4 = MediaBrowserCompat + 5;
            connect = i4 % 128;
            if (i4 % 2 != 0) {
                Object systemService = searchCoMarketingActivity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 1);
            } else {
                Object systemService2 = searchCoMarketingActivity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService2, "");
                ((InputMethodManager) systemService2).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        List<SearchMerchant> list = searchCoMarketingActivity.notify;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((SearchMerchant) obj).getKey(), "nama_produk")) {
                int i5 = connect + 97;
                MediaBrowserCompat = i5 % 128;
                if (i5 % 2 == 0) {
                    arrayList.add(obj);
                    int i6 = 14 / 0;
                } else {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!(!Intrinsics.areEqual(searchCoMarketingActivity.b, "")) && !arrayList2.isEmpty()) {
            int i7 = MediaBrowserCompat + 89;
            connect = i7 % 128;
            int i8 = i7 % 2;
            int size = searchCoMarketingActivity.notify.size();
            if (size >= 0) {
                int i9 = MediaBrowserCompat + 119;
                connect = i9 % 128;
                int i10 = i9 % 2;
                while (!Intrinsics.areEqual(searchCoMarketingActivity.notify.get(i3).getKey(), "nama_produk")) {
                    if (i3 != size) {
                        int i11 = MediaBrowserCompat + 1;
                        connect = i11 % 128;
                        int i12 = i11 % 2;
                        i3++;
                    }
                }
                int i13 = connect + 5;
                MediaBrowserCompat = i13 % 128;
                int i14 = i13 % 2;
                searchCoMarketingActivity.notify.remove(i3);
                searchCoMarketingActivity.onTransact();
            }
        } else if (searchCoMarketingActivity.notify.isEmpty()) {
            List<SearchMerchant> list2 = searchCoMarketingActivity.notify;
            Editable text = activitySearchCoMarketingBinding.edtSearch.getText();
            StringBuilder sb = new StringBuilder("%");
            sb.append((Object) text);
            sb.append("%");
            list2.add(new SearchMerchant("LIKE", sb.toString(), "nama_produk"));
            searchCoMarketingActivity.onTransact();
        } else {
            int i15 = connect + 115;
            MediaBrowserCompat = i15 % 128;
            int i16 = i15 % 2;
            if (arrayList2.isEmpty()) {
                List<SearchMerchant> list3 = searchCoMarketingActivity.notify;
                Editable text2 = activitySearchCoMarketingBinding.edtSearch.getText();
                StringBuilder sb2 = new StringBuilder("%");
                sb2.append((Object) text2);
                sb2.append("%");
                list3.add(new SearchMerchant("LIKE", sb2.toString(), "nama_produk"));
                searchCoMarketingActivity.onTransact();
            } else {
                Iterator<T> it = searchCoMarketingActivity.notify.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((SearchMerchant) next).getKey(), "nama_produk")) {
                        int i17 = MediaBrowserCompat + 119;
                        connect = i17 % 128;
                        int i18 = i17 % 2;
                        break;
                    }
                }
                SearchMerchant searchMerchant = (SearchMerchant) next;
                if (searchMerchant != null) {
                    Editable text3 = activitySearchCoMarketingBinding.edtSearch.getText();
                    StringBuilder sb3 = new StringBuilder("%");
                    sb3.append((Object) text3);
                    sb3.append("%");
                    searchMerchant.setValue(sb3.toString());
                }
                searchCoMarketingActivity.onTransact();
            }
        }
        return true;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(SearchCoMarketingActivity searchCoMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = connect + 37;
            MediaBrowserCompat = i2 % 128;
            int i3 = i2 % 2;
            searchCoMarketingActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = MediaBrowserCompat + 85;
            connect = i4 % 128;
            int i5 = i4 % 2;
            searchCoMarketingActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (((Collection) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEmpty()) {
                ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant.setVisibility(8);
                ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imResultEmpty.setVisibility(0);
                return;
            }
            int i6 = MediaBrowserCompat + 87;
            connect = i6 % 128;
            int i7 = i6 % 2;
            ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant.setVisibility(0);
            ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imResultEmpty.setVisibility(8);
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) searchCoMarketingActivity.cancel.getValue();
            lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
            lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.notifyDataSetChanged();
            ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) searchCoMarketingActivity.cancel.getValue()).b((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            RecyclerView.Adapter adapter = ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i8 = connect + 115;
            MediaBrowserCompat = i8 % 128;
            int i9 = i8 % 2;
            searchCoMarketingActivity.IconCompatParcelizer();
            ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant.setVisibility(8);
            ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imResultEmpty.setVisibility(0);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            searchCoMarketingActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(searchCoMarketingActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol2 = (lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) searchCoMarketingActivity.cancel.getValue();
            lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
            lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol2.notifyDataSetChanged();
            ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant.setVisibility(8);
            ((ActivitySearchCoMarketingBinding) ((ViewBinding) searchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imResultEmpty.setVisibility(0);
            int i10 = MediaBrowserCompat + 123;
            connect = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 5;
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchCoMarketingActivity searchCoMarketingActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            triggerAePrecapture triggeraeprecapture = (triggerAePrecapture) searchCoMarketingActivity.RemoteActionCompatParcelizer.getValue();
            FragmentManager supportFragmentManager = searchCoMarketingActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(triggeraeprecapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = connect + 105;
                MediaBrowserCompat = i2 % 128;
                if (i2 % 2 == 0) {
                    triggeraeprecapture.show(supportFragmentManager, triggeraeprecapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i3 = 26 / 0;
                } else {
                    triggeraeprecapture.show(supportFragmentManager, triggeraeprecapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                int i4 = MediaBrowserCompat + 95;
                connect = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Object next;
        SearchCoMarketingActivity searchCoMarketingActivity = (SearchCoMarketingActivity) objArr[0];
        CodeNamePair codeNamePair = (CodeNamePair) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        searchCoMarketingActivity.g = codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        searchCoMarketingActivity.d = codeNamePair.b;
        List<SearchMerchant> list = searchCoMarketingActivity.notify;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                if (searchCoMarketingActivity.notify.isEmpty() || arrayList2.isEmpty()) {
                    searchCoMarketingActivity.notify.add(new SearchMerchant("=", searchCoMarketingActivity.d, "lokasi_comar"));
                    searchCoMarketingActivity.onTransact();
                } else {
                    int i2 = connect + 121;
                    MediaBrowserCompat = i2 % 128;
                    if (i2 % 2 == 0) {
                        searchCoMarketingActivity.notify.iterator();
                        obj.hashCode();
                        throw null;
                    }
                    Iterator<T> it2 = searchCoMarketingActivity.notify.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.areEqual(((SearchMerchant) next).getKey(), "lokasi_comar"));
                    SearchMerchant searchMerchant = (SearchMerchant) next;
                    if (searchMerchant != null) {
                        int i3 = connect + 71;
                        MediaBrowserCompat = i3 % 128;
                        if (i3 % 2 == 0) {
                            searchMerchant.setValue(searchCoMarketingActivity.d);
                            obj.hashCode();
                            throw null;
                        }
                        searchMerchant.setValue(searchCoMarketingActivity.d);
                    }
                    searchCoMarketingActivity.onTransact();
                }
                return Unit.INSTANCE;
            }
            int i4 = connect + 125;
            MediaBrowserCompat = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(((SearchMerchant) it.next()).getKey(), "lokasi_comar");
                throw null;
            }
            Object next2 = it.next();
            if (Intrinsics.areEqual(((SearchMerchant) next2).getKey(), "lokasi_comar")) {
                arrayList.add(next2);
                int i5 = connect + 71;
                MediaBrowserCompat = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    public static /* synthetic */ lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl TuitionPaymentFragmentspecialinlinedviewModeldefault2(final SearchCoMarketingActivity searchCoMarketingActivity) {
        int i = 2 % 2;
        lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = new lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl(searchCoMarketingActivity, null, new Function1() { // from class: isExternalFlashAeModeEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ListMerchant) obj);
            }
        }, 2, null);
        int i2 = connect + 51;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        return lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol;
    }

    public static /* synthetic */ void b(SearchCoMarketingActivity searchCoMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        int i2 = MediaBrowserCompat + 55;
        int i3 = i2 % 128;
        connect = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i5 = i3 + 5;
            MediaBrowserCompat = i5 % 128;
            if (i5 % 2 == 0) {
                String string = searchCoMarketingActivity.getString(R.string.error_error_occured);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 1).show();
                return;
            } else {
                String string2 = searchCoMarketingActivity.getString(R.string.error_error_occured);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                return;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FocusMeteringControlExternalSyntheticLambda11 focusMeteringControlExternalSyntheticLambda11 = (FocusMeteringControlExternalSyntheticLambda11) searchCoMarketingActivity.INotificationSideChannelStub.getValue();
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(list, "");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
                int i6 = connect + 63;
                MediaBrowserCompat = i6 % 128;
                int i7 = i6 % 2;
            }
            focusMeteringControlExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayList;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        Object next;
        SearchCoMarketingActivity searchCoMarketingActivity = (SearchCoMarketingActivity) objArr[0];
        CategoryMerchant categoryMerchant = (CategoryMerchant) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categoryMerchant, "");
        searchCoMarketingActivity.a = categoryMerchant.TuitionPaymentFragmentbindingInflater1;
        searchCoMarketingActivity.asInterface = categoryMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        List<SearchMerchant> list = searchCoMarketingActivity.notify;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = connect + 57;
            MediaBrowserCompat = i2 % 128;
            int i3 = i2 % 2;
            Object next2 = it.next();
            if (Intrinsics.areEqual(((SearchMerchant) next2).getKey(), "kode_jenis_produk")) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (searchCoMarketingActivity.notify.isEmpty() || arrayList2.isEmpty()) {
            searchCoMarketingActivity.notify.add(new SearchMerchant("=", searchCoMarketingActivity.asInterface, "kode_jenis_produk"));
            searchCoMarketingActivity.onTransact();
        } else {
            Iterator<T> it2 = searchCoMarketingActivity.notify.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((SearchMerchant) next).getKey(), "kode_jenis_produk"));
            SearchMerchant searchMerchant = (SearchMerchant) next;
            if (searchMerchant != null) {
                searchMerchant.setValue(searchCoMarketingActivity.asInterface);
                int i4 = MediaBrowserCompat + 89;
                connect = i4 % 128;
                int i5 = i4 % 2;
            }
            searchCoMarketingActivity.onTransact();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ triggerAePrecapture TuitionPaymentFragmentspecialinlinedviewModeldefault3(final SearchCoMarketingActivity searchCoMarketingActivity) {
        int i = 2 % 2;
        triggerAePrecapture.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = triggerAePrecapture.INSTANCE;
        CategoryMerchant categoryMerchant = searchCoMarketingActivity.TuitionPaymentFragmentbindingInflater1;
        Function1 function1 = new Function1() { // from class: lambdacancelFocusAndMetering12androidxcameracamera2internalFocusMeteringControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (CategoryMerchant) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (Unit) SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 795267444, -795267444, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        };
        Object obj = null;
        triggerAePrecapture triggeraeprecaptureTuitionPaymentFragmentbindingInflater1 = triggerAePrecapture.Companion.TuitionPaymentFragmentbindingInflater1(null, function1);
        int i2 = connect + 95;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return triggeraeprecaptureTuitionPaymentFragmentbindingInflater1;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit b(SearchCoMarketingActivity searchCoMarketingActivity, ListMerchant listMerchant) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 61;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listMerchant, "");
        DetailPromoActivity.Companion companion = DetailPromoActivity.INSTANCE;
        DetailPromoActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(searchCoMarketingActivity, listMerchant.g, false, null);
        Unit unit = Unit.INSTANCE;
        int i4 = connect + 113;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SearchCoMarketingActivity searchCoMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            return;
        }
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 91;
        connect = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
            throw null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String string = searchCoMarketingActivity.getString(R.string.error_error_occured);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                return;
            }
            return;
        }
        int i4 = i2 + 47;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            ((triggerAePrecapture) searchCoMarketingActivity.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List<CategoryMerchant>) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else {
            ((triggerAePrecapture) searchCoMarketingActivity.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List<CategoryMerchant>) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.asBinder) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        ((defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4.cancel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        r4 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.MediaBrowserCompat + 63;
        com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if ((r4 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r1 = r1 + 19;
        com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (((defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4.cancel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r5 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.MediaBrowserCompat + 119;
        com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect = r5 % 128;
        r5 = r5 % 2;
        ((defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4.cancel.getValue()).TuitionPaymentFragmentbindingInflater1();
        ((defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4.cancel.getValue()).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        ((defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4.cancel.getValue()).TuitionPaymentFragmentbindingInflater1();
        ((defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4.cancel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((java.util.List) ((VirtualCameraAdapter1.asBinder) r5).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        ((defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4.cancel.getValue()).g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.bpjstku.presentation.promo.SearchCoMarketingActivity r4, defpackage.VirtualCameraAdapter1 r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.MediaBrowserCompat
            int r2 = r1 + 1
            int r3 = r2 % 128
            com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            boolean r2 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r3 = 28
            int r3 = r3 / 0
            if (r2 == 0) goto L27
            goto L1b
        L17:
            boolean r2 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r2 == 0) goto L27
        L1b:
            kotlin.Lazy r4 = r4.cancel
            java.lang.Object r4 = r4.getValue()
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl r4 = (defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4
            r4.g()
            return
        L27:
            boolean r2 = r5 instanceof VirtualCameraAdapter1.asBinder
            r3 = 1
            if (r2 == r3) goto L87
            boolean r2 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            if (r2 == 0) goto L4c
            kotlin.Lazy r4 = r4.cancel
            java.lang.Object r4 = r4.getValue()
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl r4 = (defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4
            r4.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            int r4 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.MediaBrowserCompat
            int r4 = r4 + 63
            int r5 = r4 % 128
            com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L47
            return
        L47:
            r4 = 0
            r4.hashCode()
            throw r4
        L4c:
            boolean r5 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r5 == 0) goto L86
            int r1 = r1 + 19
            int r5 = r1 % 128
            com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect = r5
            int r1 = r1 % r0
            kotlin.Lazy r5 = r4.cancel
            java.lang.Object r5 = r5.getValue()
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl r5 = (defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r5
            java.util.List<Data> r5 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r5 = r5.size()
            if (r5 == 0) goto L86
            int r5 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.MediaBrowserCompat
            int r5 = r5 + 119
            int r1 = r5 % 128
            com.bpjstku.presentation.promo.SearchCoMarketingActivity.connect = r1
            int r5 = r5 % r0
            kotlin.Lazy r5 = r4.cancel
            java.lang.Object r5 = r5.getValue()
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl r5 = (defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r5
            r5.TuitionPaymentFragmentbindingInflater1()
            kotlin.Lazy r4 = r4.cancel
            java.lang.Object r4 = r4.getValue()
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl r4 = (defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4
            r4.b()
        L86:
            return
        L87:
            kotlin.Lazy r0 = r4.cancel
            java.lang.Object r0 = r0.getValue()
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl r0 = (defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r0
            r0.TuitionPaymentFragmentbindingInflater1()
            kotlin.Lazy r4 = r4.cancel
            java.lang.Object r4 = r4.getValue()
            lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl r4 = (defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) r4
            VirtualCameraAdapter1$asBinder r5 = (VirtualCameraAdapter1.asBinder) r5
            T r5 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.List r5 = (java.util.List) r5
            r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.bpjstku.presentation.promo.SearchCoMarketingActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ FocusMeteringControlExternalSyntheticLambda11 TuitionPaymentFragmentspecialinlinedviewModeldefault1(SearchCoMarketingActivity searchCoMarketingActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (FocusMeteringControlExternalSyntheticLambda11) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{searchCoMarketingActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -277818914, 277818920, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(SearchCoMarketingActivity searchCoMarketingActivity, CodeNamePair codeNamePair) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{searchCoMarketingActivity, codeNamePair}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1658206525, -1658206521, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchCoMarketingActivity searchCoMarketingActivity, CategoryMerchant categoryMerchant) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{searchCoMarketingActivity, categoryMerchant}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 795267444, -795267444, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        getItem = 1;
        g();
        INSTANCE = new Companion(null);
        int i = write + 73;
        getItem = i % 128;
        int i2 = i % 2;
    }

    private final void TuitionPaymentFragmentbindingInflater1(int p0, int p1, List<SearchMerchant> p2, List<OrderMerchant> p3) {
        Object[] objArr = {this, Integer.valueOf(p0), Integer.valueOf(p1), p2, p3};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1709535975, -1709535973, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_permata).substring(19, 20).length() + 4892417, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1348722986, 1348722987, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1604548129, -1604548124, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5_bni).substring(12, 13).codePointAt(0) + 700545044;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 262050653, -262050650, iCodePointAt, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = connect + 51;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = connect + 107;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        INotificationSideChannelDefault = -6377398940819159759L;
        read = -981105359;
        IconCompatParcelizer = (char) 62012;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = connect + 63;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 69;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_search_co_marketing);
        }
        throw null;
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
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.promo.SearchCoMarketingActivity.$$c
            int r6 = 104 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r6 = r6 + 1
            r4 = r0[r6]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.SearchCoMarketingActivity.$$i(short, int, byte):java.lang.String");
    }
}
