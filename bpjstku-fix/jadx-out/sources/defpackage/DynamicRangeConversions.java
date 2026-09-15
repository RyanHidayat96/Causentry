package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentDetailPaymentHistoryBinding;
import com.bpjstku.domain.tuition.model.PaymentHistoryItem;
import com.google.android.material.button.MaterialButton;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u0003R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0013\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"LDynamicRangeConversions;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "d", "b", "Lkotlin/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "LonReady;", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;", "Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;", "", "()I", "Lcom/bpjstku/databinding/FragmentDetailPaymentHistoryBinding;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentDetailPaymentHistoryBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicRangeConversions extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private FragmentDetailPaymentHistoryBinding TuitionPaymentFragmentbindingInflater1;
    private Function1<? super String, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: setSettingsOverrideZoom
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private PaymentHistoryItem TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_detail_payment_history;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    /* JADX INFO: renamed from: DynamicRangeConversions$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LDynamicRangeConversions$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;", "p0", "Lkotlin/Function1;", "", "", "p1", "LDynamicRangeConversions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;Lkotlin/jvm/functions/Function1;)LDynamicRangeConversions;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static DynamicRangeConversions TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentHistoryItem p0, Function1<? super String, Unit> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            DynamicRangeConversions dynamicRangeConversions = new DynamicRangeConversions();
            Bundle bundle = new Bundle();
            dynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = p1;
            bundle.putParcelable("detail_payment_history", p0);
            dynamicRangeConversions.setArguments(bundle);
            return dynamicRangeConversions;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentDetailPaymentHistoryBinding fragmentDetailPaymentHistoryBindingInflate = FragmentDetailPaymentHistoryBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentDetailPaymentHistoryBindingInflate;
        if (fragmentDetailPaymentHistoryBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentDetailPaymentHistoryBindingInflate = null;
        }
        LinearLayout root = fragmentDetailPaymentHistoryBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (PaymentHistoryItem) arguments.getParcelable("detail_payment_history") : null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0245  */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentDetailPaymentHistoryBinding fragmentDetailPaymentHistoryBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentDetailPaymentHistoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentDetailPaymentHistoryBinding = null;
        }
        TextView textView = fragmentDetailPaymentHistoryBinding.tvValueTransactionId;
        PaymentHistoryItem paymentHistoryItem = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = paymentHistoryItem != null ? paymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        Intrinsics.checkNotNull(str);
        textView.setText(((String) StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString());
        PaymentHistoryItem paymentHistoryItem2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = paymentHistoryItem2 != null ? paymentHistoryItem2.onTransact : null;
        if (str2 == null || str2.length() == 0) {
            fragmentDetailPaymentHistoryBinding.imgMethodPayment.setVisibility(8);
            asBinder();
            fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription.setText("-");
        } else {
            PaymentHistoryItem paymentHistoryItem3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (Intrinsics.areEqual(paymentHistoryItem3 != null ? paymentHistoryItem3.onTransact : null, PaymentType.GOPAY)) {
                fragmentDetailPaymentHistoryBinding.imgMethodPayment.setImageResource(2131231514);
                TextView textView2 = fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription;
                PaymentHistoryItem paymentHistoryItem4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String strValueOf = String.valueOf(paymentHistoryItem4 != null ? paymentHistoryItem4.onTransact : null);
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String upperCase = strValueOf.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                textView2.setText(upperCase);
            } else {
                PaymentHistoryItem paymentHistoryItem5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (Intrinsics.areEqual(paymentHistoryItem5 != null ? paymentHistoryItem5.onTransact : null, PaymentType.SHOPEEPAY)) {
                    fragmentDetailPaymentHistoryBinding.imgMethodPayment.setImageResource(R.drawable.uikit_ic_shopeepay);
                    TextView textView3 = fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription;
                    PaymentHistoryItem paymentHistoryItem6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    String strValueOf2 = String.valueOf(paymentHistoryItem6 != null ? paymentHistoryItem6.onTransact : null);
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    String upperCase2 = strValueOf2.toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    textView3.setText(upperCase2);
                } else {
                    PaymentHistoryItem paymentHistoryItem7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (Intrinsics.areEqual(paymentHistoryItem7 != null ? paymentHistoryItem7.onTransact : null, "OVO")) {
                        fragmentDetailPaymentHistoryBinding.imgMethodPayment.setImageResource(R.drawable.bg_logo_ovo);
                        TextView textView4 = fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription;
                        PaymentHistoryItem paymentHistoryItem8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        String strValueOf3 = String.valueOf(paymentHistoryItem8 != null ? paymentHistoryItem8.onTransact : null);
                        Locale locale3 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale3, "");
                        String upperCase3 = strValueOf3.toUpperCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                        textView4.setText(upperCase3);
                    } else {
                        PaymentHistoryItem paymentHistoryItem9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (Intrinsics.areEqual(paymentHistoryItem9 != null ? paymentHistoryItem9.onTransact : null, "DD_BRI")) {
                            fragmentDetailPaymentHistoryBinding.imgMethodPayment.setImageResource(2131230997);
                            fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription.setText("BRI Debit Card");
                        } else {
                            PaymentHistoryItem paymentHistoryItem10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (Intrinsics.areEqual(paymentHistoryItem10 != null ? paymentHistoryItem10.onTransact : null, "DANA")) {
                                fragmentDetailPaymentHistoryBinding.imgMethodPayment.setImageResource(2131231295);
                                TextView textView5 = fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription;
                                PaymentHistoryItem paymentHistoryItem11 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                String strValueOf4 = String.valueOf(paymentHistoryItem11 != null ? paymentHistoryItem11.onTransact : null);
                                Locale locale4 = Locale.getDefault();
                                Intrinsics.checkNotNullExpressionValue(locale4, "");
                                String upperCase4 = strValueOf4.toUpperCase(locale4);
                                Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                                textView5.setText(upperCase4);
                            } else {
                                PaymentHistoryItem paymentHistoryItem12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (Intrinsics.areEqual(paymentHistoryItem12 != null ? paymentHistoryItem12.onTransact : null, "LINKAJA")) {
                                    fragmentDetailPaymentHistoryBinding.imgMethodPayment.setImageResource(R.drawable.ic_linkaja);
                                    TextView textView6 = fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription;
                                    PaymentHistoryItem paymentHistoryItem13 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    String strValueOf5 = String.valueOf(paymentHistoryItem13 != null ? paymentHistoryItem13.onTransact : null);
                                    Locale locale5 = Locale.getDefault();
                                    Intrinsics.checkNotNullExpressionValue(locale5, "");
                                    String upperCase5 = strValueOf5.toUpperCase(locale5);
                                    Intrinsics.checkNotNullExpressionValue(upperCase5, "");
                                    textView6.setText(upperCase5);
                                } else {
                                    fragmentDetailPaymentHistoryBinding.imgMethodPayment.setVisibility(8);
                                    asBinder();
                                    TextView textView7 = fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription;
                                    PaymentHistoryItem paymentHistoryItem14 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    String strValueOf6 = String.valueOf(paymentHistoryItem14 != null ? paymentHistoryItem14.onTransact : null);
                                    Locale locale6 = Locale.getDefault();
                                    Intrinsics.checkNotNullExpressionValue(locale6, "");
                                    String upperCase6 = strValueOf6.toUpperCase(locale6);
                                    Intrinsics.checkNotNullExpressionValue(upperCase6, "");
                                    textView7.setText(upperCase6);
                                }
                            }
                        }
                    }
                }
            }
        }
        PaymentHistoryItem paymentHistoryItem15 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (!Intrinsics.areEqual(String.valueOf(paymentHistoryItem15 != null ? paymentHistoryItem15.d : null), "settlement")) {
            PaymentHistoryItem paymentHistoryItem16 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (Intrinsics.areEqual(String.valueOf(paymentHistoryItem16 != null ? paymentHistoryItem16.d : null), "paid")) {
                fragmentDetailPaymentHistoryBinding.tvStatusPaymentHistory.setText("Berhasil");
                fragmentDetailPaymentHistoryBinding.imgStatusPaymentHistory.setImageResource(R.drawable.ic_success_mini);
            } else {
                PaymentHistoryItem paymentHistoryItem17 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (Intrinsics.areEqual(String.valueOf(paymentHistoryItem17 != null ? paymentHistoryItem17.d : null), TransactionResult.STATUS_PENDING)) {
                    TextView textView8 = fragmentDetailPaymentHistoryBinding.tvStatusPaymentHistory;
                    PaymentHistoryItem paymentHistoryItem18 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    textView8.setText(String.valueOf(paymentHistoryItem18 != null ? paymentHistoryItem18.d : null));
                    fragmentDetailPaymentHistoryBinding.imgStatusPaymentHistory.setImageResource(R.drawable.ic_waiting);
                } else {
                    TextView textView9 = fragmentDetailPaymentHistoryBinding.tvStatusPaymentHistory;
                    PaymentHistoryItem paymentHistoryItem19 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    textView9.setText(String.valueOf(paymentHistoryItem19 != null ? paymentHistoryItem19.d : null));
                    fragmentDetailPaymentHistoryBinding.imgStatusPaymentHistory.setImageResource(R.drawable.ic_info_alert);
                }
            }
        } else {
            fragmentDetailPaymentHistoryBinding.tvStatusPaymentHistory.setText("Berhasil");
            fragmentDetailPaymentHistoryBinding.imgStatusPaymentHistory.setImageResource(R.drawable.ic_success_mini);
        }
        TextView textView10 = fragmentDetailPaymentHistoryBinding.tvDatePayment;
        PaymentHistoryItem paymentHistoryItem20 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        textView10.setText(String.valueOf(paymentHistoryItem20 != null ? paymentHistoryItem20.asBinder : null));
        RecyclerView recyclerView = fragmentDetailPaymentHistoryBinding.rvDetailTuitionResult;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(new ContextThemeWrapper(recyclerView.getContext(), R.style.AppTheme), 1));
        recyclerView.setAdapter((onReady) this.b.getValue());
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentDetailPaymentHistoryBinding fragmentDetailPaymentHistoryBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentDetailPaymentHistoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentDetailPaymentHistoryBinding = null;
        }
        MaterialButton materialButton = fragmentDetailPaymentHistoryBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: fromCameraCharacteristics
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DynamicRangeConversions.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
    }

    private void asBinder() {
        FragmentDetailPaymentHistoryBinding fragmentDetailPaymentHistoryBinding = this.TuitionPaymentFragmentbindingInflater1;
        FragmentDetailPaymentHistoryBinding fragmentDetailPaymentHistoryBinding2 = null;
        if (fragmentDetailPaymentHistoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentDetailPaymentHistoryBinding = null;
        }
        ViewGroup.LayoutParams layoutParams = fragmentDetailPaymentHistoryBinding.tvMerchantPaymentDescription.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.startToStart = R.id.tvMerchantPayment;
        FragmentDetailPaymentHistoryBinding fragmentDetailPaymentHistoryBinding3 = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentDetailPaymentHistoryBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentDetailPaymentHistoryBinding2 = fragmentDetailPaymentHistoryBinding3;
        }
        fragmentDetailPaymentHistoryBinding2.tvMerchantPaymentDescription.setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ onReady TuitionPaymentFragmentspecialinlinedviewModeldefault2(DynamicRangeConversions dynamicRangeConversions) {
        Context contextRequireContext = dynamicRangeConversions.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ReportDrawnKtExternalSyntheticLambda4[] reportDrawnKtExternalSyntheticLambda4Arr = new ReportDrawnKtExternalSyntheticLambda4[6];
        PaymentHistoryItem paymentHistoryItem = dynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[0] = new ReportDrawnKtExternalSyntheticLambda4("Nama", String.valueOf(paymentHistoryItem != null ? paymentHistoryItem.a : null));
        PaymentHistoryItem paymentHistoryItem2 = dynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[1] = new ReportDrawnKtExternalSyntheticLambda4("Iuran JKK", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(paymentHistoryItem2 != null ? paymentHistoryItem2.TuitionPaymentFragmentbindingInflater1 : null)));
        PaymentHistoryItem paymentHistoryItem3 = dynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[2] = new ReportDrawnKtExternalSyntheticLambda4("Iuran JKM", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(paymentHistoryItem3 != null ? paymentHistoryItem3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null)));
        PaymentHistoryItem paymentHistoryItem4 = dynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[3] = new ReportDrawnKtExternalSyntheticLambda4("Iuran JHT", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(paymentHistoryItem4 != null ? paymentHistoryItem4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null)));
        PaymentHistoryItem paymentHistoryItem5 = dynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[4] = new ReportDrawnKtExternalSyntheticLambda4("Total Iuran", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(paymentHistoryItem5 != null ? paymentHistoryItem5.b : null)));
        PaymentHistoryItem paymentHistoryItem6 = dynamicRangeConversions.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = paymentHistoryItem6 != null ? paymentHistoryItem6.asInterface : null;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" Bulan");
        reportDrawnKtExternalSyntheticLambda4Arr[5] = new ReportDrawnKtExternalSyntheticLambda4("Masa Perlindungan", sb.toString());
        return new onReady(contextRequireContext, CollectionsKt.mutableListOf(reportDrawnKtExternalSyntheticLambda4Arr));
    }

    public static /* synthetic */ Unit b(DynamicRangeConversions dynamicRangeConversions) {
        dynamicRangeConversions.dismiss();
        return Unit.INSTANCE;
    }
}
