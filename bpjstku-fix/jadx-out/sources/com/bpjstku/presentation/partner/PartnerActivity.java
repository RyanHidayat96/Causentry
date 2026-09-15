package com.bpjstku.presentation.partner;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.partners.model.request.GetPartnerRequest;
import com.bpjstku.databinding.ActivityPartnerBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.partner.PartnerActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.ClockHandView$$ExternalSyntheticLambda0;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.kennyc.view.MultiStateView;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.calculateCameraUseCases;
import defpackage.canPositionSelectorForHoveredItem;
import defpackage.createExtraPreview;
import defpackage.ensureBundleContains;
import defpackage.getCameraUseCaseAdapter;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.setCameraOperatingMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J)\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0015\u0010\u0006\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0015\u0010\t\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010\u001a\u001a\u00020\f8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0014\u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\"8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010$"}, d2 = {"Lcom/bpjstku/presentation/partner/PartnerActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPartnerBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "d", "LcanPositionSelectorForHoveredItem;", "Lkotlin/Lazy;", "LTrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0;", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PartnerActivity extends BindingBaseActivity<ActivityPartnerBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long asInterface;
    private static int g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private CodeNamePair b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {19, 78, 114, 113};
    private static final int $$f = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 185;
    private static int cancel = 1;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f574a = 1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: TrustedWebActivityServiceConnection1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PartnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_partner;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i6;
        int i8 = ~((~i4) | i7);
        int i9 = i5 | i8 | (~(i6 | i4));
        int i10 = (~(i4 | i5)) | (~(i7 | i4)) | (~(i7 | i5));
        int i11 = i5 + i6 + i3 + (1351532378 * i2) + (1237199896 * i);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i5) + 1314914304 + ((-491389116) * i6) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i3) + ((-1818230784) * i2) + ((-914358272) * i) + ((-2051670016) * i12);
        int i14 = ((i5 * 406040238) - 634933780) + (i6 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i3 * 406039561) + (i2 * 1283666474) + (i * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        if (i15 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 != 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        PartnerActivity partnerActivity = (PartnerActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = f574a + 75;
        asBinder = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iMyUid = Process.myUid();
            int i19 = ~iMyUid;
            if (i18 != 1702515128 + (((~(i19 | (-1107336042))) | 277348498) * 220) + (((~(i19 | (-1182130026))) | 352142482) * (-440)) + ((iMyUid | (-1107336042)) * 220)) {
                throw null;
            }
        } else {
            int i20 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iMyTid = Process.myTid();
            if (i20 != (((-1751831568) + (((-277440043) | (~iMyTid)) * (-490))) + (((~(iMyTid | 1330020629)) | (-1607460672)) * 490)) - 203076758) {
                throw null;
            }
        }
        int i21 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i22 = ~((int) SystemClock.elapsedRealtime());
        int i23 = ~(327355357 | i22);
        if (i21 != (-1054245152) + ((i23 | (-2043266689)) * 764) + (((~(i22 | (-2043266689))) | 293667456) * (-1528)) + (((-1783287134) | i23) * 764)) {
            int i24 = (-738354298) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i25 = f574a + 59;
        asBinder = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.partner.PartnerActivity.$$a
            int r5 = r5 + 4
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.partner.PartnerActivity.c(int, int, short, java.lang.Object[]):void");
    }

    public PartnerActivity() {
        final PartnerActivity partnerActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<canPositionSelectorForHoveredItem>() { // from class: com.bpjstku.presentation.partner.PartnerActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [canPositionSelectorForHoveredItem, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final canPositionSelectorForHoveredItem invoke() {
                ComponentCallbacks componentCallbacks = partnerActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(canPositionSelectorForHoveredItem.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.partner.PartnerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/partner/PartnerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, String p1, String p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, PartnerActivity.class, new Pair[]{TuplesKt.to("key_province_partner", p1), TuplesKt.to("key_city_partner", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        f574a = i3;
        int i4 = i2 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i3 + 57;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPartnerBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        f574a = i2 % 128;
        int i3 = i2 % 2;
        PartnerActivity$bindingInflater$1 partnerActivity$bindingInflater$1 = PartnerActivity$bindingInflater$1.b;
        int i4 = asBinder + 63;
        f574a = i4 % 128;
        if (i4 % 2 != 0) {
            return partnerActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(asInterface ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 25;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(asInterface)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64838), 1357 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 37, 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 47773), 468 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.rgb(0, 0, 0) + 16777229, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 79;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $11 + 47;
        $10 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        CodeNamePair codeNamePairB = ((canPositionSelectorForHoveredItem) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.b();
        if (codeNamePairB != null) {
            int i2 = asBinder + 1;
            f574a = i2 % 128;
            if (i2 % 2 == 0) {
                this.b = codeNamePairB;
                int i3 = 97 / 0;
            } else {
                this.b = codeNamePairB;
            }
        }
        CodeNamePair codeNamePairTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((canPositionSelectorForHoveredItem) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (codeNamePairTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i4 = asBinder + 41;
            f574a = i4 % 128;
            int i5 = i4 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = codeNamePairTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        PartnerActivity partnerActivity = this;
        Intrinsics.checkNotNullParameter(partnerActivity, "");
        partnerActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_partner));
        ((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).swipeRefreshLayout.setNestedScrollingEnabled(false);
        RecyclerView recyclerView = ((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvPartner;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new setCameraOperatingMode(12, 16));
        recyclerView.setAdapter((TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            int i2 = f574a + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (this.b != null) {
                AppCompatTextView appCompatTextView = ((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvProvince;
                CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                CodeNamePair codeNamePair2 = null;
                if (codeNamePair == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = f574a + 1;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    codeNamePair = null;
                }
                appCompatTextView.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                AppCompatTextView appCompatTextView2 = ((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvCity;
                CodeNamePair codeNamePair3 = this.b;
                if (codeNamePair3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    codeNamePair2 = codeNamePair3;
                }
                appCompatTextView2.setText(codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
        int i6 = asBinder + 103;
        f574a = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnFilterPartner;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: notifyNotificationWithChannel
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PartnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        ((ActivityPartnerBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: TrustedWebActivityServiceConnection
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                PartnerActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        int i2 = f574a + 75;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((canPositionSelectorForHoveredItem) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new ensureBundleContains(this));
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            int i2 = f574a + 71;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (this.b == null) {
                PartnerFilterActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = PartnerFilterActivity.INSTANCE;
                PartnerFilterActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
                return;
            }
        }
        CodeNamePair codeNamePair = this.b;
        if (codeNamePair == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f574a + 17;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            codeNamePair = null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(codeNamePair);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((canPositionSelectorForHoveredItem) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new ensureBundleContains(this));
        int i2 = asBinder + 41;
        f574a = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        String str;
        PartnerActivity partnerActivity = (PartnerActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        Intent intent = (Intent) objArr[3];
        int i = 2 % 2;
        super.onActivityResult(iIntValue, iIntValue2, intent);
        Object obj = null;
        if (iIntValue == 597 && iIntValue2 == -1) {
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (extras != null) {
                int i2 = f574a + 123;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    AppCompatTextView appCompatTextView = ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvProvince;
                    obj.hashCode();
                    throw null;
                }
                CodeNamePair codeNamePair = (CodeNamePair) extras.getParcelable("key_province_partner");
                CodeNamePair codeNamePair2 = (CodeNamePair) extras.getParcelable("key_city_partner");
                ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvProvince.setText(codeNamePair != null ? codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                AppCompatTextView appCompatTextView2 = ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvCity;
                if (codeNamePair2 != null) {
                    int i3 = asBinder + 75;
                    f574a = i3 % 128;
                    if (i3 % 2 == 0) {
                        String str2 = codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        obj.hashCode();
                        throw null;
                    }
                    str = codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str = null;
                }
                appCompatTextView2.setText(str);
                if (codeNamePair2 != null) {
                    partnerActivity.b = codeNamePair2;
                }
                if (codeNamePair != null) {
                    partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = codeNamePair;
                }
                CodeNamePair codeNamePair3 = partnerActivity.b;
                if (codeNamePair3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    codeNamePair3 = null;
                }
                partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(codeNamePair3);
            }
        }
        return null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CodeNamePair p0) {
        int i = 2 % 2;
        ((canPositionSelectorForHoveredItem) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetPartnerRequest(p0.b, "1", Constants.STATUS_CODE_200));
        int i2 = asBinder + 95;
        f574a = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:5:0x0016, B:16:0x004c, B:13:0x003b, B:14:0x0043, B:15:0x004b, B:9:0x0027), top: B:21:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:5:0x0016, B:16:0x004c, B:13:0x003b, B:14:0x0043, B:15:0x004b, B:9:0x0027), top: B:21:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i;
        int i2 = 2 % 2;
        int i3 = f574a + 97;
        asBinder = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i4 = 34 / 0;
                if (p0.getItemId() == 16908332) {
                    i = asBinder + 17;
                    f574a = i % 128;
                    if (i % 2 != 0) {
                        getOnBackPressedDispatcher().onBackPressed();
                        throw null;
                    }
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    i = asBinder + 17;
                    f574a = i % 128;
                    if (i % 2 != 0) {
                        getOnBackPressedDispatcher().onBackPressed();
                        throw null;
                    }
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 43;
        f574a = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                short s = $$a[7];
                byte b = (byte) s;
                Object[] objArr2 = new Object[1];
                c(s, b, (byte) (b | 15), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iLastIndexOf, maximumDrawingCacheSize, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
            int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            short s2 = $$a[7];
            byte b2 = (byte) s2;
            Object[] objArr3 = new Object[1];
            c(s2, b2, (byte) (b2 | 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, iLastIndexOf2, iIndexOf, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int iGreen = Color.green(0) + 23;
                byte[] bArr = $$a;
                short s3 = (short) (-bArr[2]);
                byte b3 = bArr[7];
                Object[] objArr4 = new Object[1];
                c(s3, b3, b3, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf2, iGreen, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr5[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i5 = (~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp) | 136240988;
            int i6 = (-178500540) + (i5 * 495) + (((~i5) | 790108) * 495) + 1173326393;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{32940, 32966, 64143, 9720, 5972, 43278, 32119, 57428, 64730, 32506, 37867, 25731, 30843, 61968, 8065, 59644, 62935, 29074, 39519, 28496}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{38320, 38361, 1881, 55339, 37197, 12036, 29060, 60584, 59804, 33580, 5620, 26727, 27976, 3980, 39339, 58398, 57595, 35930, 7252, 25515}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_description_text).substring(0, 43).codePointAt(12) - 107, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {-1779926443};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 42049), 1727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = ClockHandView$$ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 1173326393, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                    int iIndexOf3 = TextUtils.indexOf("", "", 0) + 1755;
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                    byte[] bArr2 = $$a;
                    short s4 = (short) (-bArr2[2]);
                    byte b4 = bArr2[7];
                    Object[] objArr9 = new Object[1];
                    c(s4, b4, b4, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, iIndexOf3, iIndexOf4, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{8554, 8459, 6134, 51342, 35971, 13003, 34485, 7045, 23901, 37769, 2091, 40705, 55733, 7995, 33849, 4884, 21531, 40163, 395, 38042, 53351, 6331, 40235, 2168, 19633, 33835}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step1).substring(24, 34).length() - 10, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{64531, 64630, 9771, 63825, 36432, 12317, 62125, 28575, 32824, 41562, 2813, 60261, 1222, 12022, 34477, 26411, 35186, 44322, 844}, ViewConfiguration.getTouchSlop() >> 8, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                        int iResolveSize = View.resolveSize(0, 0) + 1755;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                        byte b5 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((short) 89, b5, b5, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iResolveSize, longPressTimeout, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                        int i9 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                        short s5 = $$a[7];
                        byte b6 = (byte) s5;
                        Object[] objArr13 = new Object[1];
                        c(s5, b6, (byte) (b6 | 15), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, i9, iCombineMeasuredStates, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            Object[] objArr14 = {new int[]{i13}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i14 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i15 = i12 + 379913813 + ((~((-57147921) | i14)) * 52) + (((~(269883499 | i14)) | (~(57281073 | i14)) | (-327031420)) * (-52)) + (((~(i14 | (-269883500))) | 133153) * 52);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr14[3])[0] = i17 ^ (i17 << 5);
            int i18 = f574a + 89;
            asBinder = i18 % 128;
            int i19 = i18 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iAlpha = Color.alpha(0) + 1031;
                int i20 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b7 = $$a[7];
                Object[] objArr15 = new Object[1];
                c((short) 141, b7, b7, objArr15);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity, iAlpha, i20, 1357589585, false, (String) objArr15[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
            Object[] objArr16 = new Object[1];
            e(new char[]{8554, 8459, 6134, 51342, 35971, 13003, 34485, 7045, 23901, 37769, 2091, 40705, 55733, 7995, 33849, 4884, 21531, 40163, 395, 38042, 53351, 6331, 40235, 2168, 19633, 33835}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            e(new char[]{64531, 64630, 9771, 63825, 36432, 12317, 62125, 28575, 32824, 41562, 2813, 60261, 1222, 12022, 34477, 26411, 35186, 44322, 844}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).codePointAt(0) - 32, objArr17);
            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                int trimmedLength = TextUtils.getTrimmedLength("") + 15;
                byte[] bArr3 = $$a;
                short s6 = (short) (-bArr3[2]);
                byte b8 = bArr3[7];
                Object[] objArr18 = new Object[1];
                c(s6, b8, b8, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, scrollBarFadeDuration2, trimmedLength, 1344079056, false, (String) objArr18[0], null);
            }
            if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cRed = (char) Color.red(0);
                    int i21 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int i22 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                    Object[] objArr19 = new Object[1];
                    c((short) 193, $$a[28], (byte) 52, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cRed, i21, i22, 632103528, false, (String) objArr19[0], null);
                }
                Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i23 = ((int[]) objArr20[3])[0];
                int i24 = ((int[]) objArr20[1])[0];
                String[] strArr = (String[]) objArr20[0];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i25 = ~iElapsedRealtime;
                int i26 = (-2140082559) + (((~(664912076 | i25)) | 269495346) * 168) + ((~((-269495347) | iElapsedRealtime)) * 168) + (((~(iElapsedRealtime | 934407422)) | (~(i25 | (-909192247))) | 639696900) * 168) + 1189588734;
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
            } else {
                Object[] objArr21 = new Object[1];
                e(new char[]{32940, 32966, 64143, 9720, 5972, 43278, 32119, 57428, 64730, 32506, 37867, 25731, 30843, 61968, 8065, 59644, 62935, 29074, 39519, 28496}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_cimb_clicks).substring(0, 11).length() - 11, objArr21);
                Class<?> cls4 = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                e(new char[]{38320, 38361, 1881, 55339, 37197, 12036, 29060, 60584, 59804, 33580, 5620, 26727, 27976, 3980, 39339, 58398, 57595, 35930, 7252, 25515}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, objArr22);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr23 = {-1779926443};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (KeyEvent.getMaxKeyCode() >> 16)), 1135 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 1189588734, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char cMyTid2 = (char) (Process.myTid() >> 22);
                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 1031;
                    int i29 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b9 = $$a[7];
                    Object[] objArr25 = new Object[1];
                    c((short) 141, b9, b9, objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cMyTid2, trimmedLength2, i29, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 1117, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                    int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                    Object[] objArr26 = new Object[1];
                    c((short) 193, $$a[28], (byte) 52, objArr26);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mirror, minimumFlingVelocity2, packedPositionChild, 632103528, false, (String) objArr26[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
                try {
                    Object[] objArr27 = new Object[1];
                    e(new char[]{8554, 8459, 6134, 51342, 35971, 13003, 34485, 7045, 23901, 37769, 2091, 40705, 55733, 7995, 33849, 4884, 21531, 40163, 395, 38042, 53351, 6331, 40235, 2168, 19633, 33835}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.delete_this_card).substring(11, 12).length() - 1, objArr27);
                    Class<?> cls5 = Class.forName((String) objArr27[0]);
                    Object[] objArr28 = new Object[1];
                    e(new char[]{64531, 64630, 9771, 63825, 36432, 12317, 62125, 28575, 32824, 41562, 2813, 60261, 1222, 12022, 34477, 26411, 35186, 44322, 844}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr28);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int trimmedLength3 = TextUtils.getTrimmedLength("") + 1031;
                        int i30 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        short s7 = (short) (-bArr4[2]);
                        byte b10 = bArr4[7];
                        Object[] objArr29 = new Object[1];
                        c(s7, b10, b10, objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(absoluteGravity, trimmedLength3, i30, 1344079056, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int iResolveSize2 = View.resolveSize(0, 0) + 1031;
                        int i31 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
                        byte b11 = $$a[7];
                        Object[] objArr30 = new Object[1];
                        c((short) 141, b11, b11, objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cLastIndexOf, iResolveSize2, i31, 1357589585, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i32 = ((int[]) objArr[1])[0];
            int i33 = ((int[]) objArr[3])[0];
            if (i33 == i32) {
                Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i34 = ((int[]) objArr[2])[0];
                int i35 = ((int[]) objArr[3])[0];
                int i36 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[0];
                int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 34621327;
                int i38 = ~i37;
                int i39 = i34 + (-1844088423) + ((~(135509076 | i38)) * (-560)) + ((~(i37 | (-107479810))) * (-560)) + (((~(108771093 | i38)) | 134217792) * 560);
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr31[2])[0] = i41 ^ (i41 << 5);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i3 < strArr3.length) {
                    arrayList.add(strArr3[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i33));
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr4 != null) {
            while (i3 < strArr4.length) {
                arrayList2.add(strArr4[i3]);
                i3++;
            }
        }
        throw new RuntimeException(String.valueOf(i11));
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -307234613
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
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r9)
            int r5 = ~r4
            r6 = -328431847(0xffffffffec6c8719, float:-1.1437779E27)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 311650370(0x12936842, float:9.302706E-28)
            r6 = r6 | r7
            r7 = 1158419389(0x450c13bd, float:2241.2336)
            r8 = r7 | r5
            int r8 = ~r8
            r6 = r6 | r8
            r8 = -1141637914(0xffffffffbbf3fce6, float:-0.0074459193)
            r8 = r8 | r4
            int r8 = ~r8
            r6 = r6 | r8
            int r6 = r6 * (-84)
            r8 = -1829464504(0xffffffff92f49648, float:-1.5435612E-27)
            int r8 = r8 + r6
            r4 = r4 | r7
            int r4 = ~r4
            r6 = 328431846(0x139378e6, float:3.7227232E-27)
            r4 = r4 | r6
            r6 = -1158419390(0xffffffffbaf3ec42, float:-0.0018609839)
            r5 = r5 | r6
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * (-84)
            int r8 = r8 + r4
            r4 = 1141637913(0x440c0319, float:560.0484)
            r4 = r4 | r5
            int r4 = r4 * 84
            int r8 = r8 + r4
            if (r1 != r8) goto La7
            java.lang.reflect.Member[] r1 = defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r9)
            int r4 = ~r2
            r5 = -165378(0xfffffffffffd79fe, float:NaN)
            r4 = r4 | r5
            int r4 = ~r4
            r6 = 1716076708(0x664940a4, float:2.3759702E23)
            r4 = r4 | r6
            int r4 = r4 * (-591)
            r6 = -1029120362(0xffffffffc2a8de96, float:-84.43474)
            int r6 = r6 + r4
            r2 = r2 | r5
            int r2 = r2 * 591
            int r6 = r6 + r2
            if (r1 == r6) goto L97
            int r1 = com.bpjstku.presentation.partner.PartnerActivity.f574a
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.bpjstku.presentation.partner.PartnerActivity.asBinder = r2
            int r1 = r1 % r0
            r1 = -307234613(0xffffffffedaff8cb, float:-6.807581E27)
            int[] r1 = new int[r1]
            r2 = -307234614(0xffffffffedaff8ca, float:-6.8075805E27)
            r4 = 1
            r1[r2] = r4
            r2 = 128186414(0x7a3f82e, float:2.467138E-34)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
            int r1 = com.bpjstku.presentation.partner.PartnerActivity.asBinder
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.bpjstku.presentation.partner.PartnerActivity.f574a = r2
            int r1 = r1 % r0
        L97:
            super.onResume()
            int r1 = com.bpjstku.presentation.partner.PartnerActivity.f574a
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.bpjstku.presentation.partner.PartnerActivity.asBinder = r2
            int r1 = r1 % r0
            if (r1 != 0) goto La6
            return
        La6:
            throw r3
        La7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.partner.PartnerActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        f574a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step1).substring(24, 34).codePointAt(7) + 855736024;
            if (i3 != (-783856528) + (((~((-846793481) | iCodePointAt)) | 16805937) * (-756)) + (((~iCodePointAt) | (-846793481)) * 756)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i6 = (-1074585944) + (((~((-50048697) | i5)) | 42706480 | (~(880036239 | i5))) * (-880));
            int i7 = (~((-50048697) | (~i5))) | (-880036240);
            int i8 = ~(i5 | 50048696);
            if (i4 != i6 + ((i7 | i8) * (-880)) + (i8 * 880)) {
                throw null;
            }
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i10 = ~((~((int) Process.getStartUptimeMillis())) | 1031383619);
        if (i9 != (((557850690 | i10) * (-374)) - 245839790) + ((i10 | 473532929) * 374)) {
            throw null;
        }
        super.onCreate(bundle);
        int i11 = f574a + 55;
        asBinder = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ void b(PartnerActivity partnerActivity) {
        int i = 2 % 2;
        int i2 = f574a + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.g();
        try {
            CodeNamePair codeNamePair = partnerActivity.b;
            if (codeNamePair == null) {
                int i4 = asBinder + 15;
                f574a = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = asBinder + 23;
                f574a = i6 % 128;
                int i7 = i6 % 2;
                codeNamePair = null;
            }
            ((canPositionSelectorForHoveredItem) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetPartnerRequest(codeNamePair.b, "1", Constants.STATUS_CODE_200));
        } finally {
            ViewPortBuilder.asBinder();
        }
    }

    public static /* synthetic */ TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2(PartnerActivity partnerActivity) {
        int i = 2 % 2;
        TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 = new TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0(partnerActivity, null, null, 6, null);
        int i2 = asBinder + 67;
        f574a = i2 % 128;
        int i3 = i2 % 2;
        return trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PartnerActivity partnerActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 9;
        int i4 = i3 % 128;
        f574a = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            partnerActivity.MediaBrowserCompat();
            str = "loading_view_partner_health_care";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            partnerActivity.IconCompatParcelizer();
            MultiStateView multiStateView = ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPartner;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(multiStateView, partnerActivity.getString(R.string.error_partner_notfound), null, null, null);
            ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).swipeRefreshLayout.setRefreshing(false);
            str = "empty_view_partner_health_care";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i5 = i4 + 55;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            partnerActivity.IconCompatParcelizer();
            MultiStateView multiStateView2 = ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPartner;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(multiStateView2, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, null);
            ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).swipeRefreshLayout.setRefreshing(false);
            str = "failure_view_partner_health_care";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i7 = i2 + 7;
            f574a = i7 % 128;
            int i8 = i7 % 2;
            partnerActivity.IconCompatParcelizer();
            MultiStateView multiStateView3 = ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvPartner;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
            ((ActivityPartnerBinding) ((ViewBinding) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).swipeRefreshLayout.setRefreshing(false);
            TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 = (TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0.d.clear();
            trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0.notifyDataSetChanged();
            ((TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0) partnerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            str = "success_view_partner_health_care";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_search_partner_health_care", str));
        Intrinsics.checkNotNullParameter(partnerActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PartnerActivity partnerActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_search_partner_health_care", "filter_search_partner_health_care"));
        Intrinsics.checkNotNullParameter(partnerActivity, "");
        Intrinsics.checkNotNullParameter("filter_search_partner_health_care", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("filter_search_partner_health_care", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("filter_search_partner_health_care", mapMutableMapOf);
        PartnerFilterActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = PartnerFilterActivity.INSTANCE;
        PartnerFilterActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(partnerActivity);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 3;
        f574a = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        g = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancel + 21;
        g = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1949521367, MapTypeAdapterFactory.Adapter.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, 1389265184, -1389265183);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) throws IllegalAccessException {
        Object[] objArr = {this, Integer.valueOf(p0), Integer.valueOf(p1), p2};
        int iB = MapTypeAdapterFactory.Adapter.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MapTypeAdapterFactory.Adapter.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 366201177, iB, objArr, 758873592, -758873592);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 1187174374;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(LongTaskEvent.asBinder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iCodePointAt, new Object[]{this}, 356350805, -356350803);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f574a + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 57;
        f574a = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        asInterface = 5974657685895329136L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        f574a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 * 3
            int r7 = r7 + 107
            byte[] r1 = com.bpjstku.presentation.partner.PartnerActivity.$$c
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.partner.PartnerActivity.$$i(short, int, byte):java.lang.String");
    }
}
