package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemBalanceDetailCheckBinding;
import com.bpjstku.presentation.program.model.BalanceInfo;
import com.bpjstku.util.constant.MembershipType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LlambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/program/model/BalanceInfo;", "LlambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;)LlambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl extends setVirtualCameraRotationDegrees<BalanceInfo, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    public /* synthetic */ lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl(Context context, List<BalanceInfo> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemBalanceDetailCheckBinding itemBalanceDetailCheckBindingInflate = ItemBalanceDetailCheckBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemBalanceDetailCheckBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemBalanceDetailCheckBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<BalanceInfo> {
        private /* synthetic */ lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ItemBalanceDetailCheckBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdagetCameraCapturePipelineAsync5androidxcameracamera2internalCamera2CameraControlImpl lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl, ItemBalanceDetailCheckBinding itemBalanceDetailCheckBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemBalanceDetailCheckBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl;
            Context context = lambdagetcameracapturepipelineasync5androidxcameracamera2internalcamera2cameracontrolimpl.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemBalanceDetailCheckBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemBalanceDetailCheckBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BalanceInfo balanceInfo) throws Throwable {
            String string;
            String str;
            String str2;
            BalanceInfo balanceInfo2 = balanceInfo;
            Intrinsics.checkNotNullParameter(balanceInfo2, "");
            ItemBalanceDetailCheckBinding itemBalanceDetailCheckBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            View view = this.itemView;
            TextView textView = itemBalanceDetailCheckBinding.tvBalanceValueDetail;
            String str3 = balanceInfo2.d;
            textView.setText(str3 != null ? getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(Double.parseDouble(str3)) : null);
            TextView textView2 = itemBalanceDetailCheckBinding.tvBalanceSegmentValue;
            if (balanceInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                MembershipType membershipType = balanceInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                string = membershipType != null ? membershipType.name() : null;
            } else {
                string = view.getResources().getString(R.string.label_status_failed);
            }
            textView2.setText(string);
            TextView textView3 = itemBalanceDetailCheckBinding.tvBalanceCompanyValue;
            String string2 = balanceInfo2.asInterface;
            if (string2 == null) {
                string2 = view.getResources().getString(R.string.label_status_failed);
                Intrinsics.checkNotNullExpressionValue(string2, "");
            }
            textView3.setText(string2);
            TextView textView4 = itemBalanceDetailCheckBinding.tvBalanceTotalWorkerValue;
            String string3 = balanceInfo2.g;
            if (string3 == null) {
                string3 = view.getResources().getString(R.string.label_status_failed);
                Intrinsics.checkNotNullExpressionValue(string3, "");
            }
            textView4.setText(string3);
            TextView textView5 = itemBalanceDetailCheckBinding.tvBalanceLatestTuitionValue;
            String str4 = balanceInfo2.cancelAll;
            if (str4 != null) {
                str = str4;
            } else {
                String string4 = view.getResources().getString(R.string.label_status_failed);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                str = string4;
            }
            textView5.setText(str);
            TextView textView6 = itemBalanceDetailCheckBinding.tvBalanceLatestTuitionPaymentValue;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = balanceInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                str2 = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                String string5 = view.getResources().getString(R.string.label_status_failed);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                str2 = string5;
            }
            textView6.setText(str2);
            itemBalanceDetailCheckBinding.tvMembershipStatus.setText(view.getResources().getString(R.string.label_membership_status));
            itemBalanceDetailCheckBinding.tvBalanceSegment.setText(view.getResources().getString(R.string.label_membership_segment));
            itemBalanceDetailCheckBinding.tvBalanceCompany.setText(view.getResources().getString(R.string.label_employer_name));
            itemBalanceDetailCheckBinding.tvBalanceTotalWorker.setText(view.getResources().getString(R.string.label_total_worker));
            itemBalanceDetailCheckBinding.tvBalanceLatestTuition.setText(view.getResources().getString(R.string.label_latest_tuition));
            itemBalanceDetailCheckBinding.tvBalanceLatestTuitionPayment.setText(view.getResources().getString(R.string.label_latest_tuition_payment));
            itemBalanceDetailCheckBinding.tvBalanceFollowedProgram.setText(view.getResources().getString(R.string.label_followed_program));
            if (StringsKt.contains$default((CharSequence) String.valueOf(balanceInfo2.a), (CharSequence) "JHT", false, 2, (Object) null)) {
                itemBalanceDetailCheckBinding.imgProgramJHT.setVisibility(0);
                itemBalanceDetailCheckBinding.tvProgramItemJHT.setVisibility(0);
            } else {
                itemBalanceDetailCheckBinding.imgProgramJHT.setVisibility(8);
                itemBalanceDetailCheckBinding.tvProgramItemJHT.setVisibility(8);
            }
            if (StringsKt.contains$default((CharSequence) String.valueOf(balanceInfo2.a), (CharSequence) "JP", false, 2, (Object) null)) {
                itemBalanceDetailCheckBinding.imgProgramJP.setVisibility(0);
                itemBalanceDetailCheckBinding.tvProgramItemJP.setVisibility(0);
            } else {
                itemBalanceDetailCheckBinding.imgProgramJP.setVisibility(8);
                itemBalanceDetailCheckBinding.tvProgramItemJP.setVisibility(8);
            }
            if (StringsKt.contains$default((CharSequence) String.valueOf(balanceInfo2.a), (CharSequence) "JKP", false, 2, (Object) null)) {
                itemBalanceDetailCheckBinding.imgProgramJKP.setVisibility(0);
                itemBalanceDetailCheckBinding.tvProgramItemJKP.setVisibility(0);
            } else {
                itemBalanceDetailCheckBinding.imgProgramJKP.setVisibility(8);
                itemBalanceDetailCheckBinding.tvProgramItemJKP.setVisibility(8);
            }
            if (!StringsKt.contains$default((CharSequence) String.valueOf(balanceInfo2.a), (CharSequence) "JKK", false, 2, (Object) null) || !StringsKt.contains$default((CharSequence) String.valueOf(balanceInfo2.a), (CharSequence) "JKM", false, 2, (Object) null)) {
                itemBalanceDetailCheckBinding.imgProgramJKK.setVisibility(8);
                itemBalanceDetailCheckBinding.tvProgramItemJKK.setVisibility(8);
                itemBalanceDetailCheckBinding.imgProgramJKM.setVisibility(8);
                itemBalanceDetailCheckBinding.tvProgramItemJKM.setVisibility(8);
                itemBalanceDetailCheckBinding.tvProgramFollowedError.setVisibility(0);
            }
            if (StringsKt.equals(balanceInfo2.cancel, "Y", false)) {
                itemBalanceDetailCheckBinding.cvBalanceDetail.setCardBackgroundColor(view.getResources().getColor(R.color.colorDarkMint));
                itemBalanceDetailCheckBinding.tvBalanceStatusDetail.setCompoundDrawablesRelativeWithIntrinsicBounds(view.getResources().getDrawable(R.drawable.ic_active), (Drawable) null, (Drawable) null, (Drawable) null);
                itemBalanceDetailCheckBinding.tvBalanceStatusDetail.setText(R.string.label_status_active);
                itemBalanceDetailCheckBinding.tvMembershiStatusValue.setText(view.getResources().getString(R.string.label_status_active));
            } else if (StringsKt.equals(balanceInfo2.cancel, ExifInterface.GPS_DIRECTION_TRUE, false)) {
                itemBalanceDetailCheckBinding.cvBalanceDetail.setCardBackgroundColor(view.getResources().getColor(R.color.colorCoolGrey));
                itemBalanceDetailCheckBinding.tvBalanceStatusDetail.setCompoundDrawablesRelativeWithIntrinsicBounds(view.getResources().getDrawable(R.drawable.ic_non_active), (Drawable) null, (Drawable) null, (Drawable) null);
                itemBalanceDetailCheckBinding.tvBalanceStatusDetail.setText(R.string.label_status_inactive);
                itemBalanceDetailCheckBinding.tvMembershiStatusValue.setText(view.getResources().getString(R.string.label_status_inactive));
            } else {
                itemBalanceDetailCheckBinding.cvBalanceDetail.setCardBackgroundColor(view.getResources().getColor(R.color.colorCoolGrey));
                itemBalanceDetailCheckBinding.tvBalanceStatusDetail.setCompoundDrawablesRelativeWithIntrinsicBounds(view.getResources().getDrawable(R.drawable.ic_non_active), (Drawable) null, (Drawable) null, (Drawable) null);
                itemBalanceDetailCheckBinding.tvBalanceStatusDetail.setText(R.string.label_status_inactive);
                itemBalanceDetailCheckBinding.tvMembershiStatusValue.setText(view.getResources().getString(R.string.label_status_failed));
            }
            if (balanceInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == MembershipType.BPU || balanceInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == MembershipType.PMI) {
                itemBalanceDetailCheckBinding.tvBalanceCompany.setVisibility(8);
                itemBalanceDetailCheckBinding.tvBalanceCompanyValue.setVisibility(8);
                itemBalanceDetailCheckBinding.viewDividerBalanceCompanyName.setVisibility(8);
                itemBalanceDetailCheckBinding.tvBalanceTotalWorker.setVisibility(8);
                itemBalanceDetailCheckBinding.tvBalanceTotalWorkerValue.setVisibility(8);
                itemBalanceDetailCheckBinding.viewDividerBalanceTotalWorkerValue.setVisibility(8);
                itemBalanceDetailCheckBinding.tvBalanceLatestTuition.setVisibility(8);
                itemBalanceDetailCheckBinding.tvBalanceLatestTuitionValue.setVisibility(8);
                itemBalanceDetailCheckBinding.viewDividerBalanceLatestTuitionValue.setVisibility(8);
                TextView textView7 = itemBalanceDetailCheckBinding.tvBalanceLatestTuition;
                Intrinsics.checkNotNullExpressionValue(textView7, "");
                TextView textView8 = textView7;
                ViewGroup.LayoutParams layoutParams = textView8.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.topToBottom = R.id.viewDividerSegment;
                    textView8.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            itemBalanceDetailCheckBinding.tvBalanceCompany.setVisibility(0);
            itemBalanceDetailCheckBinding.tvBalanceCompanyValue.setVisibility(0);
            itemBalanceDetailCheckBinding.viewDividerBalanceCompanyName.setVisibility(0);
            itemBalanceDetailCheckBinding.tvBalanceTotalWorker.setVisibility(0);
            itemBalanceDetailCheckBinding.tvBalanceTotalWorkerValue.setVisibility(0);
            itemBalanceDetailCheckBinding.viewDividerBalanceTotalWorkerValue.setVisibility(0);
            itemBalanceDetailCheckBinding.tvBalanceLatestTuition.setVisibility(0);
            itemBalanceDetailCheckBinding.tvBalanceLatestTuitionValue.setVisibility(0);
            itemBalanceDetailCheckBinding.viewDividerBalanceLatestTuitionValue.setVisibility(0);
            TextView textView9 = itemBalanceDetailCheckBinding.tvBalanceLatestTuition;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            TextView textView10 = textView9;
            ViewGroup.LayoutParams layoutParams3 = textView10.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.topToBottom = R.id.viewDividerBalanceTotalWorkerValue;
                textView10.setLayoutParams(layoutParams4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }
}
